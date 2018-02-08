package com.avaya.scheduller.example;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.avaya.scheduller.example.dto.LoginData;
import com.avaya.scheduller.example.dto.LoginResponse;
import com.avaya.scheduller.example.dto.v2.AttendeeV2;
import com.avaya.scheduller.example.dto.v2.ConferenceV2;
import com.avaya.scheduller.example.dto.v2.GetConferenceResponseV2;
import com.avaya.scheduller.example.dto.v2.ScheduleConferenceRequestV2;
import com.avaya.scheduller.example.dto.v2.UpdateConferenceResponseV2;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.org.apache.xml.internal.security.utils.Base64;

@SpringBootApplication
public class ExampleApplication {

	private final static String BASE_URL = "https://prototype.avaya.com:443/";
	/**
	 * this service prefix should correspond meeting type prefix from Equinox Management
	 */
	public static final String MEETING_SERVICE_ID_PREFIX = "71";

	public static void main(String[] args)
			throws NoSuchAlgorithmException, KeyManagementException, DatatypeConfigurationException {

		// we need to get all available resources from server
		JsonNode resources = getResources(BASE_URL, null);

		//these login and password should be replaced with login and password of common user
		String login = "serviceAPI";
		String password = "1234";
		// now we need to get link for authentication service
		JsonNode jsonNode = resources.get("resources").get("authentication").get("POST").get("login").get("href");
		//we need to get authentication token from server
		String token = getToken(login, password, jsonNode.asText());


		// Note, that set of available resources for authenticated user and guest user are different, so now we need
		// to get resources for authenticated user to get links for scheduling
		JsonNode authenticatedUserResources = getResources(BASE_URL, token);

		JsonNode createConferenceUrl = authenticatedUserResources.get("resources").get("conference").get("POST")
				.get("createConference").get("href");
		JsonNode searchConferenceUrl = authenticatedUserResources.get("resources").get("conference").get("GET")
				.get("getConferences").get("href");

		String number = MEETING_SERVICE_ID_PREFIX + "022";
		scheduleConference(token, "Description of conference", "Subject of conference", MEETING_SERVICE_ID_PREFIX, number, Base64.encode("1234".getBytes()),
						   Base64.encode("6797".getBytes()),createConferenceUrl.asText());
		findConference(token,searchConferenceUrl.asText());

	}

	private static JsonNode getResources(String baseUrl, String token) throws KeyManagementException,
			NoSuchAlgorithmException {

		Builder request = getClient().target(baseUrl + "ups/resources").request();
		if (token != null) {
			request.header("Authorization", "UPToken " + token);
		}
		return request.get(JsonNode.class);
	}

	private static void findConference(String token, String searchConferenceUrl) throws KeyManagementException,
			NoSuchAlgorithmException {

		// try to find conference by it's number.  You could get description of all possible parameters in
		// documentation at https://app.swaggerhub.com/apis/glad-orange/meeting-management_service/3.3.0.0-SNAPSHOT
		GetConferenceResponseV2 response = getClient()
				.target(searchConferenceUrl)
				.queryParam("detailed","true")
				.queryParam("number","71022")
				.request("application/vnd.avaya.portal.meeting.search.v2+json")
				.header("Authorization", "UPToken " + token)
				.get(GetConferenceResponseV2.class);
		System.out.println(response);

		for (ConferenceV2 conferenceV2 : response.getConferences()) {
			System.out.println(conferenceV2.getStartTime());
			System.out.println(conferenceV2.getPlannedEndTime());
			System.out.println(conferenceV2.getAttendees().toString());
			System.out.println(conferenceV2.getSwcLaunchURLforModerator());
		}

	}

	private static void scheduleConference(String token, String description, String subject, String servicePrefix,
			String number, String accessPin, String moderatorPin, String createConfrenceUrl)
			throws KeyManagementException, NoSuchAlgorithmException, DatatypeConfigurationException {
		ScheduleConferenceRequestV2 r = new ScheduleConferenceRequestV2();
		ConferenceV2 conference = new ConferenceV2();
		// should be generated for each meeting individually
		conference.setAccessPIN(accessPin.getBytes());
		conference.setModeratorPIN(moderatorPin.getBytes());

		// should start starts service prefix.
		conference.setNumber(number);
		// service prefix is orefix from meeting type in Equinox Management
        conference.setServicePrefix(servicePrefix);

		conference.setDescription(description);
		conference.setSubject(subject);

		// set start time of conference - in two minutes from now
		LocalDateTime start = LocalDateTime.now().plusMinutes(2);
		conference.setStartTime(DateTimeFormatter.ISO_DATE_TIME.format(start));
		// note, that you set duration of the meeting, but not end time explicitly
		conference.setDuration(DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 1, 0, 0));
		// we want witing room to be enabled, so non-moderators will hear "wait until organizar joins  the meeting
		conference.setWaitingRoom(true);

		// we could add some attendees. This is optional.
		AttendeeV2 e = new AttendeeV2();
		e.setFirstName("Andrey");
		e.setLastName("Tarasov");
		e.setEmail("atarasov@something.domain");
		conference.getAttendees().add(e);

		r.getConference().add(conference);

		UpdateConferenceResponseV2 post = getClient()
				.target(createConfrenceUrl)
				.request("application/vnd.avaya.portal.meeting.schedule.v2+json")
				.header("Authorization", "UPToken " + token)
				.post(Entity.entity(r, "application/vnd.avaya.portal.meeting.schedule.v2+json"))
				.readEntity(UpdateConferenceResponseV2.class);
		System.out.println(post);


		// note, that display name should be replaced with actual name of job seeker and agent. Agent should be
		// moderator
		System.out.println("Link for agent: " + post.getSwcLaunchURLforModerator());
		System.out.println("Link for jobseeker: " + post.getSwcLaunchURLforParticipant());
		
		// uncomment to delete. You need to preserve conference id if you want to delete conference later
/*		getClient().target(BASE_URL + "ups/resources/conference/" + post.getConferenceId())
				.request().delete();*/

	}



	private static String getToken(String login, String password,String url)
			throws KeyManagementException, NoSuchAlgorithmException {

		Client c = getClient();

		LoginData loginData = new LoginData();
		loginData.setLogin(login);
		loginData.setPassword(password);
		// note that request/response types are mandatory
		LoginResponse response = c.
				target(url)
				.request("application/vnd.avaya.portal.authentication.login.v1+json")
				.post(Entity.entity(loginData, "application/vnd.avaya.portal.authentication.login.v1+json"),
						LoginResponse.class);

		return response.getToken();
	}

	/**
	 * This is just a client which ignores all certificates error.
	 */
	private static Client getClient() throws NoSuchAlgorithmException, KeyManagementException {
		SSLContext sc = SSLContext.getInstance("TLS");
		sc.init(null, trustAllCerts, new SecureRandom());
		return ClientBuilder.newBuilder().sslContext(sc).hostnameVerifier(new TrustAllHostNameVerifier())
		.build();
	}

	static TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
		public X509Certificate[] getAcceptedIssuers(){return null;}
		public void checkClientTrusted(X509Certificate[] certs, String authType){}
		public void checkServerTrusted(X509Certificate[] certs, String authType){}
	}};
	public static class TrustAllHostNameVerifier implements HostnameVerifier {

		public boolean verify(String hostname, SSLSession session) {
			return true;
		}

	}
}

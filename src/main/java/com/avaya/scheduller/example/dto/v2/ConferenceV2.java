package com.avaya.scheduller.example.dto.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.Duration;

import com.avaya.scheduller.example.dto.AdvancedProperties;
import com.avaya.scheduller.example.dto.BroadcastSetting;
import com.avaya.scheduller.example.dto.Daily;
import com.avaya.scheduller.example.dto.LayoutInfo;
import com.avaya.scheduller.example.dto.Monthly;
import com.avaya.scheduller.example.dto.RecurrenceEndType;
import com.avaya.scheduller.example.dto.Weekly;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, isGetterVisibility=Visibility.NONE, setterVisibility= Visibility.NONE)
public class ConferenceV2 {
    protected String memberId;
    protected String userId;
    /**
     * Optional. If you want to pre-specify a number for dialing to that videoconference, enter it here. The number is composed of the service prefix and the unique number you created. Maximum length is 128 characters. If you left this tag blank, the system returns the number assigned to this videoconference
     */
    protected String number;
    /**
     * The PIN to access this virtual room if defined. Encoded in BASE64.
     */
    protected byte[] accessPIN;
    /**
     * The optional PIN to take on moderator rights in videoconferences held in this virtual room. Encoded in BASE64.
     */
    protected byte[] moderatorPIN;
    /**
     * The ID of the meeting type (service) stored in Scopia® Management, often activated by dialing the prefix for this meeting type Specify ServiceTemplateId or ServicePrefix. Scopia® Management only needs one of these values to find the meeting type.
     */
    protected String serviceTemplateId;
    /**
     * The prefix on the dial string associated with the ServiceTemplateId. Specify either ServiceTemplateId or ServicePrefix. Scopia® Management only needs one of these values to find the meeting type.
     */
    protected String servicePrefix;
    /**
     * Determines whether this user's virtual room is able to stream a videoconference to viewers using a streaming client like VLC. Possible values are: • ON indicates streaming is allowed. • OFF indicates this user does not have the rights to stream a videoconference. • DISABLED indicates there is no Scopia® Desktop Streaming Server to support this functionality
     */
    protected String allowStreaming;
    /**
     * Determines whether and how to cascade the videoconference. When more than one MCU is available in a distributed network, you can choose to place all participants on a central MCU, or you can cascade the meeting over several MCUs. Possible values are: • DELAY indicates Scopia® Management invites all participants directly to a main MCU, whatever their location. Scopia® Management allocates resources to ensure the best video quality. Since DELAY can be costly in terms of bandwidth, we recommend to take topology into account before selecting. • LOCAL indicates Scopia® Management invites all participants to meetings hosted on their local MCUs (according to IP topology settings). It then cascades these meetings together to form a single conference. This preserves bandwidth. • UNSPECIFIED indicates the system behaves according to the default meeting settings of Scopia® Management.
     */
    protected String priority;
    /**
     * Defines whether streaming is enabled for viewing clients in an ongoing meeting. Possible values are: • ON indicates streaming is enabled for this videoconference. • OFF indicates streaming is disabled for this videoconference.
     */
    protected String streamingStatus;
    /**
     * Container holding details of a user or an endpoint. Endpoints are represented by the TerminalID, TerminalName, TerminalNumber, while users are represented by their UserId, FirstName, LastName and Email. You must specify at least an endpoint or a user, or you can define both.
     */
    protected List<AttendeeV2> attendees = new ArrayList<>();
    /**
     * Define the number of ports (participant connections) with different resolutions reserved for this
     * videoconference.
     */
    protected ReservedPortsV2 reservedPorts;
    /**
     * BOOL indicating if others can join this videoconference by dialing in
     */
    protected Boolean blockDialIn;
    /**
     * BOOL indicating if the videoconference can be automatically extended.
     */
    protected Boolean autoExtend;
    /**
     * BOOL indicating whether this videoconference has waiting room functionality enabled.
     */
    protected Boolean waitingRoom;
    protected Boolean testRecurrConfScheduling;
    /**
     * Container for additional properties of this videoconference.
     */
    protected AdvancedProperties advancedProperties;
    /**
     * BOOL indicating whether this videoconference (as opposed to the virtual room's default) has a PIN which must be entered for a participant to successfully join.
     */
    protected Boolean oneTimePINRequired;
    protected String conferenceId;
    /**
     * The current status of the videoconference. We suggest leaving this field blank in this request. The response can hold one of the following values: • ABNORMAL_STOPPED indicates the videoconference terminated with a significant error. • CANCELLED indicates the videoconference was scheduled and then cancelled. • FINISHED indicates the videoconference has already ended. • IN_SESSION indicates the videoconference is ongoing. • NOT_START indicates the videoconference has not yet started. • SCHEDULE_FAILED indicates an error while attempting to schedule this videoconference. • START_FAILED indicates an error while trying to start the videoconference. • STOP_FAILED indicates an error while trying to end the videoconference.
     */
    protected String status;
    /**
     * A longer description of the videoconference.
     */
    protected String description;
    /**
     * The title of the videoconference.
     */
    protected String subject;
    /**
     * For recurring videoconferences only, where the recurring start time is at a specified date and time. The format is in UTC time: YYYY-MM-DDThh:mm:ss+hh:mm, for example 2012-07-26T17:30:00+08:30. The time zone is specified as an offset of UTC, by adding a positive or negative number of hours and minutes
     */
    protected String startTime;
    /**
     * ID representing the time zone for scheduling videoconferences internationally. For example, enter the value Asia/Singapore to represent GMT+08:00. For a complete list of time zone IDs, see Wikipedia.
     */
    protected String timeZoneId;
    protected String earlyTime;
    protected String plannedEndTime;
    /**
     * The planned duration of the videoconference. Expressed as a standard duration type in XML. For example, P1H30M denotes 1 hour 15 minutes. The string is composed as follows: • P is at the start of the string (mandatory) indicating the period of time. • nY indicates the number of years. • nM indicates the number of months. • nD indicates the number of days. • T indicates the start of the time section (mandatory if specifying a time). • nH indicates the number of hours. • nM indicates the number of minutes. • nS indicates the number of seconds.
     */
    protected Duration duration;
    /**
     * The ID of the location as defined in Scopia® Management. This field is often used for branches in an organization. The videoconference is held on an MCU, where one of its properties is its location
     */
    protected String locationId;
    /**
     * BOOL. This is used when testing the scheduling functionality, to verify resource usage. Send this request once with this value set to TRUE, to verify the resources are available, then send it again set to FALSE to actually make the booking.
     */
    protected Boolean testOnly;
    /**
     * BOOL indicating whether to send out an email to all participants when the videoconference is created, changed or removed from the schedule
     */
    protected Boolean sendingNotification;
    /**
     * BOOL indicating whether recording automatically starts when the videoconference begins.
     */
    protected Boolean recordingMeetingWhenStart;
    /**
     * Container for videoconferences recurring every few days. For a non-recurring meeting, omit this from the request.
     */
    protected Daily daily;
    /**
     * Container tag for videoconferences which recur on a weekly basis. For a nonrecurring meeting, omit this from the request.
     */
    protected Weekly weekly;
    /**
     * Container for videoconferences which recur on a monthly basis. For a nonrecurring meeting, omit this from the request
     */
    protected Monthly monthly;
    /**
     * Container to define the end condition of recurring videoconferences. They can end by a certain date, or after a certain number of meetings.
     */
    protected RecurrenceEndType recurrenceEnd;
    /**
     * container for broadcast settings. Only applciable, when allowBroadcast is true
     */
    protected BroadcastSetting broadcastSetting;

    /**
     * Direct URL which should be used by moderator to join this meeting. Note, that participant name should be
     * replaced (&displayName=[ToBeReplaced]). Also note, that this field is present only for search requests with
     * detailed=true
     */
    protected String swcLaunchURLforModerator;

    /**
     * Direct URL which should be used by regular participant to join this meeting. Note, that participant name should
     * be replaced (&displayName=[ToBeReplaced]). Also note, that this field is present only for search requests with
     * detailed=true
     */
    protected String participantLaunchURL;

    protected String recurrenceId;
    /**
     * Is this conference event conference
     */
    protected Boolean eventConference;
    /**
     * Panelist number for event conference
     */
    protected String panelistNumber;

    protected LayoutInfo mainVideoLayout;
    protected LayoutInfo customerVideoLayout;

    /**
     * Login id of the owner of the conference.
     */
    protected String loginId;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getSwcLaunchURLforModerator() {
        return swcLaunchURLforModerator;
    }

    public void setSwcLaunchURLforModerator(String swcLaunchURLforModerator) {
        this.swcLaunchURLforModerator = swcLaunchURLforModerator;
    }

    public String getParticipantLaunchURL() {
        return participantLaunchURL;
    }

    public void setParticipantLaunchURL(String participantLaunchURL) {
        this.participantLaunchURL = participantLaunchURL;
    }



    public ConferenceV2() {
        // default constructor for Jackson
    }

    public String getRecurrenceId() {
        return recurrenceId;
    }

    public void setRecurrenceId(String recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public String getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }



    public LayoutInfo getMainVideoLayout() {
        return mainVideoLayout;
    }

    public void setMainVideoLayout(LayoutInfo mainVideoLayout) {
        this.mainVideoLayout = mainVideoLayout;
    }

    public LayoutInfo getCustomerVideoLayout() {
        return customerVideoLayout;
    }

    public void setCustomerVideoLayout(LayoutInfo customerVideoLayout) {
        this.customerVideoLayout = customerVideoLayout;
    }


    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getServiceTemplateId() {
        return serviceTemplateId;
    }

    public Boolean getTestRecurrConfScheduling() {
        return testRecurrConfScheduling;
    }

    public void setTestRecurrConfScheduling(Boolean testRecurrConfScheduling) {
        this.testRecurrConfScheduling = testRecurrConfScheduling;
    }

    public Boolean getRecordingMeetingWhenStart() {
        return recordingMeetingWhenStart;
    }

    public String getPanelistNumber() {
        return panelistNumber;
    }

    public void setPanelistNumber(String panelistNumber) {
        this.panelistNumber = panelistNumber;
    }

    public void setServiceTemplateId(String serviceTemplateId) {
        this.serviceTemplateId = serviceTemplateId;
    }

    public String getServicePrefix() {
        return servicePrefix;
    }

    public void setServicePrefix(String servicePrefix) {
        this.servicePrefix = servicePrefix;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStreamingStatus() {
        return streamingStatus;
    }

    public void setStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    public void setStreamingStatusType(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    public List<AttendeeV2> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<AttendeeV2> attendees) {
        this.attendees = attendees;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEarlyTime() {
        return earlyTime;
    }

    public void setEarlyTime(String earlyTime) {
        this.earlyTime = earlyTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Boolean isRecordingMeetingWhenStart() {
        return recordingMeetingWhenStart;
    }

    public void setRecordingMeetingWhenStart(Boolean recordingMeetingWhenStart) {
        this.recordingMeetingWhenStart = recordingMeetingWhenStart;
    }

    public byte[] getAccessPIN() {
        return accessPIN;
    }

    public void setAccessPIN(byte[] accessPIN) {
        this.accessPIN = accessPIN;
    }

    public byte[] getModeratorPIN() {
        return moderatorPIN;
    }

    public void setModeratorPIN(byte[] moderatorPIN) {
        this.moderatorPIN = moderatorPIN;
    }

    public String getAllowStreaming() {
        return allowStreaming;
    }

    public void setAllowStreaming(String allowStreaming) {
        this.allowStreaming = allowStreaming;
    }

    public ReservedPortsV2 getReservedPorts() {
        return reservedPorts;
    }

    public void setReservedPorts(ReservedPortsV2 reservedPorts) {
        this.reservedPorts = reservedPorts;
    }

    public Boolean getBlockDialIn() {
        return blockDialIn;
    }

    public void setBlockDialIn(Boolean blockDialIn) {
        this.blockDialIn = blockDialIn;
    }

    public Boolean getAutoExtend() {
        return autoExtend;
    }

    public void setAutoExtend(Boolean autoExtend) {
        this.autoExtend = autoExtend;
    }

    public Boolean getWaitingRoom() {
        return waitingRoom;
    }

    public void setWaitingRoom(Boolean waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    public AdvancedProperties getAdvancedProperties() {
        return advancedProperties;
    }

    public void setAdvancedProperties(AdvancedProperties advancedProperties) {
        this.advancedProperties = advancedProperties;
    }

    public Boolean getOneTimePINRequired() {
        return oneTimePINRequired;
    }

    public void setOneTimePINRequired(Boolean oneTimePINRequired) {
        this.oneTimePINRequired = oneTimePINRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public Weekly getWeekly() {
        return weekly;
    }

    public void setWeekly(Weekly weekly) {
        this.weekly = weekly;
    }

    public Monthly getMonthly() {
        return monthly;
    }

    public void setMonthly(Monthly monthly) {
        this.monthly = monthly;
    }

    public RecurrenceEndType getRecurrenceEnd() {
        return recurrenceEnd;
    }

    public void setRecurrenceEnd(RecurrenceEndType recurrenceEnd) {
        this.recurrenceEnd = recurrenceEnd;
    }

    public Boolean getTestOnly() {
        return testOnly;
    }

    public void setTestOnly(Boolean testOnly) {
        this.testOnly = testOnly;
    }

    public Boolean getSendingNotification() {
        return sendingNotification;
    }

    public void setSendingNotification(Boolean sendingNotification) {
        this.sendingNotification = sendingNotification;
    }

    /**
     * @return the broadcastSetting
     */
    public BroadcastSetting getBroadcastSetting() {
        return broadcastSetting;
    }

    /**
     * @param broadcastSetting the broadcastSetting to set
     */
    public void setBroadcastSetting(BroadcastSetting broadcastSetting) {
        this.broadcastSetting = broadcastSetting;
    }

    public Boolean getEventConference() {
        return eventConference;
    }

    public void setEventConference(Boolean eventConference) {
        this.eventConference = eventConference;
    }

    @Override
    public String toString() {
        return "Conference [memberId=" + memberId + ", userId=" + userId
                + ", number=" + number + ", serviceTemplateId="
                + serviceTemplateId + ", servicePrefix=" + servicePrefix
                + ", allowStreaming=" + allowStreaming + ", priority="
                + priority + ", streamingStatus=" + streamingStatus
                + ", attendees=" + attendees + ", reservedPorts=" + reservedPorts
                + ", blockDialIn=" + blockDialIn + ", autoExtend=" + autoExtend
                + ", waitingRoom=" + waitingRoom + ", advancedProperties="
                + advancedProperties + ", conferenceId=" + conferenceId
                + ", status=" + status + ", description=" + description
                + ", subject=" + subject + ", startTime=" + startTime
                + ", timeZoneId=" + timeZoneId + ", earlyTime=" + earlyTime
                + ", plannedEndTime=" + plannedEndTime + ", duration="
                + duration + ", locationId=" + locationId + ", testOnly="
                + testOnly + ", sendingNotification=" + sendingNotification
                + ", recordingMeetingWhenStart=" + recordingMeetingWhenStart
                + ", daily=" + daily + ", weekly=" + weekly + ", monthly="
                + monthly + ", recurrenceEnd=" + recurrenceEnd
                + ", broadcastSetting=" + broadcastSetting + ", recurrenceId="
                + recurrenceId + ", eventConference=" + eventConference + "]";
    }
}
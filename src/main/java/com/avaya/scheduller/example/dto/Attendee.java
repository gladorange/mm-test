package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "attendees")
public class Attendee extends Terminal {
    @XmlElement(name = "userId")
    protected String userId;
    @XmlElement(name = "email")
    protected String email;
    @XmlElement(name = "firstName")
    protected String firstName;
    @XmlElement(name = "lastName")
    protected String lastName;
    @XmlElement(name = "host")
    protected Boolean host;
    @XmlElement(name = "organizer")
    protected Boolean organizer;



    public Attendee() {
        // Constructor for Jackson
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public boolean isSetUserId() {
        return this.userId != null;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public boolean isSetEmail() {
        return this.email != null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return this.firstName != null;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return this.lastName != null;
    }

    public Boolean isHost() {
        return this.host;
    }

    public void setHost(Boolean value) {
        this.host = value;
    }

    public boolean isSetHost() {
        return this.host != null;
    }

    public Boolean isOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(Boolean value) {
        this.organizer = value;
    }

    public boolean isSetOrganizer() {
        return this.organizer != null;
    }

    @Override
    public String toString() {
        return "Attendee [terminalId=" + terminalId + ", terminalName=" + terminalName + ", protocol=" + protocol
                + ", terminalNumber=" + terminalNumber + ", maxBandwidth=" + maxBandwidth + ", maxISDNBandwidth="
                + maxISDNBandwidth + ", areaCode=" + areaCode + ", countryCode=" + countryCode + ", telephoneNumber="
                + telephoneNumber + ", threeG=" + threeG + ", restrictedMode=" + restrictedMode + ", voiceOnly="
                + voiceOnly + ", userId=" + userId + ", email=" + email + ", firstName=" + firstName + ", lastName="
                + lastName + ", host=" + host + ", organizer=" + organizer + "]";
    }
}

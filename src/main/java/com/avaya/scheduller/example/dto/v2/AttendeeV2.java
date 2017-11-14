package com.avaya.scheduller.example.dto.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class AttendeeV2 extends TerminalV2 {
    /**
     * Internal id of user.
     */
    protected String userId;
    /**
     * Email of user
     */
    protected String email;

    protected String firstName;
    protected String lastName;
    /**
     * BOOL indicating whether this participant is hosting the videoconference.
     */
    protected Boolean host = false;
    /**
     * BOOL indicating whether this participant is the designated organizer of the videoconference.
     */
    protected Boolean organizer = false;
    /**
     * For event conference only. Boolean, indicating, that this participant is in panelist
     */
    protected Boolean panelist = false;


    public AttendeeV2() {
        // Constructor for Jackson
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public Boolean isHost() {
        return this.host;
    }

    public void setHost(Boolean value) {
        this.host = value;
    }

    public Boolean isOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(Boolean value) {
        this.organizer = value;
    }

    public Boolean isPanelist() {
        return panelist;
    }

    public void setPanelist(Boolean panelist) {
        this.panelist = panelist;
    }


    @Override
    public String toString() {
        return "Attendee [terminalId=" + terminalId + ", terminalName=" + terminalName + ", protocol="
                + ", terminalNumber=" + terminalNumber + ", maxBandwidth=" + maxBandwidth + ", maxISDNBandwidth="
                + maxISDNBandwidth + ", areaCode=" + areaCode + ", countryCode=" + countryCode + ", telephoneNumber="
                + telephoneNumber + ", threeG=" + threeG + ", restrictedMode=" + restrictedMode + ", voiceOnly="
                + voiceOnly + ", userId=" + userId + ", email=" + email + ", firstName=" + firstName + ", lastName="
                + lastName + ", host=" + host + ", organizer=" + organizer + ", panelist=" + panelist + "]";
    }
}

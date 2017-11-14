package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetResourceAvailabilityRequest {

    /**
     * Conference id Optional Need to be set under the conference editing mode. For new meeting, it can be ignored.
     */
    @XmlElement(name = "conferenceId")
    protected String conferenceId;
    /**
     * Conference number you dial to connect to the video conference. Optional Need to be set for new meeting.
     */
    @XmlElement(name = "number")
    protected String number;
    /**
     *  Meeting service id rather than meeting service prefix. Optional For new meeting, it has to be set. For ediitting meeting, old meeting service id will be replaced with it.
     */
    @XmlElement(name = "meetingServiceId")
    protected String meetingServiceId;
    /**
     * The start time of the availability rather than the meeting start time
     */
    @XmlElement(name = "startTime")
    protected long startTime;
    /**
     * The end time of the availiability rather than the meeting end time
     */
    @XmlElement(name = "endTime")
    protected long endTime;
    /**
     * Container indicates the internal or external terminal
     */
    @XmlElement(name = "attendees")
    protected List<Attendee> attendees;
    /**
     * If it’s true, virtual MCU is counted. If it’s false, virtual MCU isn’t be counted. Optional By default, it is false
     */
    @XmlElement(name = "virtualMCUIncluded", defaultValue = "false")
    protected boolean virtualMCUIncluded;
    /**
     *  This container defines the number of ports (participant connections) with different resolutions reserved by this meeting. Optional
     */
    @XmlElement(name = "reservedPorts")
    protected ReservedPorts reservedPorts;

    public String getConferenceId() {
        return this.conferenceId;
    }

    public void setConferenceId(String value) {
        this.conferenceId = value;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public String getMeetingServiceId() {
        return this.meetingServiceId;
    }

    public void setMeetingServiceId(String value) {
        this.meetingServiceId = value;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long value) {
        this.startTime = value;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long value) {
        this.endTime = value;
    }

    public List<Attendee> getAttendees() {
        if (this.attendees == null) {
            this.attendees = new ArrayList<Attendee>();
        }

        return this.attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    public boolean isVirtualMCUIncluded() {
        return this.virtualMCUIncluded;
    }

    public void setVirtualMCUIncluded(boolean value) {
        this.virtualMCUIncluded = value;
    }

    public ReservedPorts getReservedPorts() {
        return this.reservedPorts;
    }

    public void setReservedPorts(ReservedPorts value) {
        this.reservedPorts = value;
    }

    @Override
    public String toString() {
        return "GetResourceAvailabilityRequest [conferenceId=" + conferenceId + ", number=" + number
                + ", meetingServiceId=" + meetingServiceId + ", startTime=" + startTime + ", endTime =" + endTime
                + ", attendeesNumber=" + getAttendees().size() + ", virtualMCUIncluded=" + virtualMCUIncluded + ", reservedPorts="
                + reservedPorts + "]]";
    }
}

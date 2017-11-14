package com.avaya.scheduller.example.dto.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetResourceAvailabilityRequestV2 {
    @XmlElement(name = "conferenceId")
    protected String conferenceId;
    @XmlElement(name = "number")
    protected String number;
    @XmlElement(name = "meetingServiceId")
    protected String meetingServiceId;
    @XmlElement(name = "startTime")
    protected long startTime;
    @XmlElement(name = "endTime")
    protected long endTime;
    @XmlElement(name = "attendees")
    protected List<AttendeeV2> attendees;
    @XmlElement(name = "virtualMCUIncluded", defaultValue = "false")
    protected boolean virtualMCUIncluded;
    @XmlElement(name = "reservedPorts")
    protected ReservedPortsV2 reservedPorts;

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

    public List<AttendeeV2> getAttendees() {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }

        return this.attendees;
    }

    public void setAttendees(List<AttendeeV2> attendees) {
        this.attendees = attendees;
    }

    public boolean isVirtualMCUIncluded() {
        return this.virtualMCUIncluded;
    }

    public void setVirtualMCUIncluded(boolean value) {
        this.virtualMCUIncluded = value;
    }

    public ReservedPortsV2 getReservedPorts() {
        return this.reservedPorts;
    }

    public void setReservedPorts(ReservedPortsV2 value) {
        this.reservedPorts = value;
    }

    @Override
    public String toString() {
        return "GetResourceAvailabilityRequest [conferenceId=" + conferenceId + ", number=" + number
                + ", meetingServiceId=" + meetingServiceId + ", startTime=" + startTime + ", endTime =" + endTime
                + ", attendeesNumber=" + getAttendees().size() + ", virtualMCUIncluded=" + virtualMCUIncluded
                + ", reservedPorts=" + reservedPorts + "]]";
    }
}

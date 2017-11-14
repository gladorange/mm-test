package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlRootElement
public class CancelConferenceRequest {
    @XmlElement(name = "conferenceId", required = true)
    protected String conferenceId;
    @XmlElement(name = "startTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "sendingNotification")
    protected boolean sendingNotification;



    public CancelConferenceRequest() {
        // constructor for Jackson

    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    public void setStartTime(XMLGregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public boolean getSendingNotification() {
        return sendingNotification;
    }

    public void setSendingNotification(boolean sendingNotification) {
        this.sendingNotification = sendingNotification;
    }

    @Override
    public String toString() {
        return "CancelConferenceRequest [conferenceId=" + conferenceId + ", startTime=" + startTime
                + ", sendingNotification=" + sendingNotification + "]";
    }
}
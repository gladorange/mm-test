package com.avaya.scheduller.example.dto.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ScheduleConferenceRequestV2 {
    /**
     * Conference details to be scheduled. Note, this list must contain information about single conference.
     */
    @XmlElement(name = "conference")
    private List<ConferenceV2> conference = new ArrayList<>();

    public List<ConferenceV2> getConference() {
        return conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    public void setConference(List<ConferenceV2> conference) {
        this.conference = conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "ScheduleConferenceRequest [conference=" + conference + "]";
    }
}

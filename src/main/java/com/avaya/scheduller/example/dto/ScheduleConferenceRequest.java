package com.avaya.scheduller.example.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ScheduleConferenceRequest {
    @XmlElement(name = "conference")
    private List<Conference> conference;

    public List<Conference> getConferences() {
        return conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    public void setConferences(List<Conference> conference) {
        this.conference = conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "ScheduleConferenceRequest [conference=" + conference + "]";
    }
}

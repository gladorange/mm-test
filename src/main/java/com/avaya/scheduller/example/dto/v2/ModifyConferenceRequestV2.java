package com.avaya.scheduller.example.dto.v2;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ModifyConferenceRequestV2 {
    @XmlElement(name = "conference")
    private List<ConferenceV2> conference;

    public List<ConferenceV2> getConference() {
        return conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    public void setConference(List<ConferenceV2> conference) {
        this.conference = conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "ModifyConferenceRequest [conference=" + conference + "]";
    }
}
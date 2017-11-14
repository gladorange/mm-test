package com.avaya.scheduller.example.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ModifyConferenceRequest {
    @XmlElement(name = "conference")
    private List<Conference> conference;

    public List<Conference> getConference() {
        return conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    public void setConference(List<Conference> conference) {
        this.conference = conference;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "ModifyConferenceRequest [conference=" + conference + "]";
    }
}
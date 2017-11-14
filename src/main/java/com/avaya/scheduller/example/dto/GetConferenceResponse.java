package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class GetConferenceResponse {
    @XmlElement(name = "conferences")
    protected List<Conference> conferences = new ArrayList<>();



    public GetConferenceResponse() {
        // constructor for Jackson

    }

    public List<Conference> getConferences() {
        return this.conferences;
    }

    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }

    @Override
    public String toString() {
        return "GetConferenceResponse [conferences=" + conferences + "]";
    }
}
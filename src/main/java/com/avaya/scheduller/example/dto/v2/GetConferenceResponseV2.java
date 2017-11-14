package com.avaya.scheduller.example.dto.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class GetConferenceResponseV2 {
    /**
     * List of conferences
     */
    @XmlElement(name = "conferences")
    protected List<ConferenceV2> conferences = new ArrayList<>();



    public GetConferenceResponseV2() {
        // constructor for Jackson

    }

    public List<ConferenceV2> getConferences() {
        return this.conferences;
    }

    public void setConferences(List<ConferenceV2> conferences) {
        this.conferences = conferences;
    }

    @Override
    public String toString() {
        return "GetConferenceResponse [conferences=" + conferences + "]";
    }
}
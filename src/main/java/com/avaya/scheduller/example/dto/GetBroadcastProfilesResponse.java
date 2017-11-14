package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class GetBroadcastProfilesResponse {
    @XmlElement(name = "broadcastProfiles")
    private List<BroadcastProfileElement> broadCastProfiles = new ArrayList<BroadcastProfileElement>();


    public GetBroadcastProfilesResponse() {
        // constructor for Jackson

    }

    /**
     * @return the broadCastProfiles
     */
    public List<BroadcastProfileElement> getBroadCastProfiles() {
        return broadCastProfiles;//NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    /**
     * @param broadCastProfiles
     *            the broadCastProfiles to set
     */
    public void setBroadCastProfiles(List<BroadcastProfileElement> broadCastProfiles) {
        this.broadCastProfiles = broadCastProfiles;//NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "GetBroadcastProfilesResponse [broadCastProfiles=" + broadCastProfiles + "]";
    }

}

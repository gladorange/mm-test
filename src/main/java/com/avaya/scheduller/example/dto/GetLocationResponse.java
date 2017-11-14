package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class GetLocationResponse {
    @XmlElement(name = "location")
    private List<NetLocation> locations = new ArrayList<NetLocation>();



    public GetLocationResponse() {
        // constructor for Jackson

    }

    public List<NetLocation> getLocations() {
        return locations;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    public void setLocations(List<NetLocation> locations) {
        this.locations = locations;// NOSONAR DTO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "GetLocationResponse [locations=" + locations + "]";
    }
}
package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;





@XmlRootElement
public class GetResourceAvailabilityResponse {
    @XmlElement(name = "resourceAvailability")
    protected List<ResourceAvailability> resourceAvailabilities = new ArrayList<ResourceAvailability>();

    public GetResourceAvailabilityResponse() {
        // constructor for Jackson
    }



    public List<ResourceAvailability> getResourceAvailabilities() {
        if (this.resourceAvailabilities == null) {
            this.resourceAvailabilities = new ArrayList<ResourceAvailability>();
        }

        return this.resourceAvailabilities;
    }

    public void setResourceAvailabilities(List<ResourceAvailability> resourceAvailabilities) {
        this.resourceAvailabilities = resourceAvailabilities;
    }
    
    @Override
    public String toString() {
        return "GetResourceAvailabilityResponse [resourceAvailability [" + resourceAvailabilities + "]]";
    }
}
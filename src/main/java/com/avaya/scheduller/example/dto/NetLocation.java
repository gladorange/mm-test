package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "location")
public class NetLocation {
    @XmlElement(name = "locationId")
    private String locationId;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "description")
    private String description;


    public NetLocation() {
        // constructor for Jackson
    }

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String value) {
        this.locationId = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    @Override
    public String toString() {
        return "NetLocation [locationId=" + locationId + ", name=" + name + ", description=" + description + "]";
    }
}
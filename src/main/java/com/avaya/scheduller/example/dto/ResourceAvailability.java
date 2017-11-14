package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;




public class ResourceAvailability {
    @XmlElement(name = "id", required = true)
    protected String id;
    @XmlElement(name = "number", required = true)
    protected String number;
    @XmlElement(name = "type", required = true)
    protected String type;
    @XmlElement(name = "availability")
    protected List<Availability> availabilities;

    public ResourceAvailability() {
        // constructor for Jackson
    }


    public String getID() {
        return this.id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public List<Availability> getAvailabilities() {
        if (this.availabilities == null) {
            this.availabilities = new ArrayList<Availability>();
        }

        return this.availabilities;
    }

    public void setAvailabilities(List<Availability> availabilities) {
        this.availabilities = availabilities;
    }

    @Override
    public String toString() {
        return "ResourceAvailability [id =" + id + ", type=" + type + ", number=" + number + ", availability ["
                + availabilities + "]";
    }
}

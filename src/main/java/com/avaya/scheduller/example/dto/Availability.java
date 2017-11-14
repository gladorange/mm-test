package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;



public class Availability {
    @XmlElement(name = "fromTime")
    protected long fromTime;
    @XmlElement(name = "toTime")
    protected long toTime;
    @XmlElement(name = "status", required = true)
    protected String status;
    
    public Availability() {
        // constructor for Jackson
    }


    public long getFromTime() {
        return this.fromTime;
    }

    public void setFromTime(long value) {
        this.fromTime = value;
    }

    public long getToTime() {
        return this.toTime;
    }

    public void setToTime(long value) {
        this.toTime = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    @Override
    public String toString() {
        return "Availability [fromTime=" + fromTime + ", toTime=" + toTime + ", status=" + status + "]";
    }
    
    
}
package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class CancelConferenceResponse {
    @XmlElement(name = "returnValue")
    protected String returnValue;


    public CancelConferenceResponse() {
        // constructor for Jackson
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public String toString() {
        return "CancelConferenceResponse [returnValue=" + returnValue + "]";
    }
}
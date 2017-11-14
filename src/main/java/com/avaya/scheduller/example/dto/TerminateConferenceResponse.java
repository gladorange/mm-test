package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class TerminateConferenceResponse {
    @XmlElement(name = "returnValue")
    protected String returnValue;



    public TerminateConferenceResponse() {
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
        return "TerminateConferenceResponse [returnValue=" + returnValue + "]";
    }
}
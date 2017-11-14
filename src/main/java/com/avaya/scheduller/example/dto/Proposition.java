package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Proposition {
    @XmlElement(name = "number")
    protected String number;

    public Proposition() {
        // constructor for Jackson
    }


    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     *            the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Proposition [number=" + number + "]";
    }

}

package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Daily {
    /**
     * Number indicating the videoconference recurs every x days.
     */
    @XmlElement(name = "numberOfEveryDay")
    protected Integer numberOfEveryDay;
    /**
     * BOOL indicating if it recurs every weekday.
     */
    @XmlElement(name = "everyWeekDay")
    protected Boolean everyWeekDay;


    public Daily() {
        // constructor for Jackson
    }

    public Integer getNumberOfEveryDay() {
        return numberOfEveryDay;
    }

    public void setNumberOfEveryDay(Integer numberOfEveryDay) {
        this.numberOfEveryDay = numberOfEveryDay;
    }

    public Boolean getEveryWeekDay() {
        return everyWeekDay;
    }

    public void setEveryWeekDay(Boolean everyWeekDay) {
        this.everyWeekDay = everyWeekDay;
    }

    @Override
    public String toString() {
        return "Daily [numberOfEveryDay=" + numberOfEveryDay + ", everyWeekDay=" + everyWeekDay + "]";
    }
}

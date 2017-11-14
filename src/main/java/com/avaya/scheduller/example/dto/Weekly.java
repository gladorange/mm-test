package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class Weekly {

    /**
     * Videoconference recurs on specific days of the week. This can be one or more days, where each day has its own tag. For example: ["MON","THU"]
     */
    protected List<String> daysOfWeek = new ArrayList<>();

    /**
     * Number indicating the videoconference recurs every x weeks.
     */
    @XmlElement(name = "numberOfEveryWeek")
    protected int numberOfEveryWeek;



    public Weekly() {
        // constructor for Jackson
    }

    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<String> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public int getNumberOfEveryWeek() {
        // we need this to workaround iView hanging, when this value isn't set and default value (0) is sent via XML API
        return numberOfEveryWeek != 0 ? numberOfEveryWeek : 1;
    }

    public void setNumberOfEveryWeek(int numberOfEveryWeek) {
        this.numberOfEveryWeek = numberOfEveryWeek;
    }

    @Override
    public String toString() {
        return "Weekly [daysOfWeek=" + daysOfWeek + ", numberOfEveryWeek=" + numberOfEveryWeek + "]";
    }
}

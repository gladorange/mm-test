package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Monthly {
    /**
     * Number indicating the videoconference recurs every x months.
     */
    @XmlElement(name = "numberOfEveryMonth")
    protected int numberOfEveryMonth;
    /**
     * Number indicating the videoconference recurs on the xth of every month.
     */
    @XmlElement(name = "dayOfMonth")
    protected Integer dayOfMonth;

    /**
     * Container for videoconferences recuring on the xth week in the month on a given day. For example, the third Sunday of every month.
     */
    @XmlElement(name = "dayOfNumberOfEveryMonth")
    protected DayOfNumberOfEveryMonthType dayOfNumberOfEveryMonth;


    public Monthly() {
        // constructor for Jackson

    }

    public int getNumberOfEveryMonth() {
        // we need this to workaround iView hanging, when this value isn't set and default value (0) is sent via XML API
        return numberOfEveryMonth != 0 ? numberOfEveryMonth : 1;
    }

    public void setNumberOfEveryMonth(int numberOfEveryMonth) {
        this.numberOfEveryMonth = numberOfEveryMonth;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public DayOfNumberOfEveryMonthType getDayOfNumberOfEveryMonth() {
        return dayOfNumberOfEveryMonth;
    }

    public void setDayOfNumberOfEveryMonth(DayOfNumberOfEveryMonthType dayOfNumberOfEveryMonth) {
        this.dayOfNumberOfEveryMonth = dayOfNumberOfEveryMonth;
    }

    @Override
    public String toString() {
        return "Monthly [numberOfEveryMonth=" + numberOfEveryMonth + ", dayOfMonth=" + dayOfMonth
                + ", dayOfNumberOfEveryMonth=" + dayOfNumberOfEveryMonth + "]";
    }
}

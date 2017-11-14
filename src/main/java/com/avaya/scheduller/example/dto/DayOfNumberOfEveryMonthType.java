package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;





@XmlRootElement
public class DayOfNumberOfEveryMonthType {
    @XmlElement(name = "weekOfMonth")
    protected String weekOfMonth;
    @XmlElement(name = "dayOfWeek")
    protected String dayOfWeek;


    public DayOfNumberOfEveryMonthType() {
        // constructor for Jackson
    }

    public String getWeekOfMonth() {
        return weekOfMonth;
    }

    public void setWeekOfMonth(String weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "DayOfNumberOfEveryMonthType [weekOfMonth=" + weekOfMonth + ", dayOfWeek=" + dayOfWeek + "]";
    }


}

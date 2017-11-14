package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;



@XmlRootElement
public class RecurrenceEndType {
    /**
     * The end date of the recurring videoconference. The format is in UTC time: YYYY-MM-DDThh:mm:ss+hh:mm, for example 2012-07-26T17:30:00+08:30. The time zone is specified as an offset of UTC, by adding a positive or negative number of hours and minutes.
     */
    @XmlElement(name = "by")
    @XmlSchemaType(name = "date")
    protected String by;
    /**
     * Number indicating the videoconference stops recurring after x meetings.
     */
    @XmlElement(name = "endOfOccurrences")
    protected Integer endOfOccurrences;



    public RecurrenceEndType() {
        // constructor for Jackson
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public Integer getEndOfOccurrences() {
        return endOfOccurrences;
    }

    public void setEndOfOccurrences(Integer endOfOccurrences) {
        this.endOfOccurrences = endOfOccurrences;
    }

    @Override
    public String toString() {
        return "RecurrenceEndType [by=" + by + ", endOfOccurrences=" + endOfOccurrences + "]";
    }
}

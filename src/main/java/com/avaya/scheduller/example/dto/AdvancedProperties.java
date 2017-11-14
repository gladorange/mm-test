package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.Duration;



@XmlRootElement(name = "advancesProperties")
public class AdvancedProperties {

    /**
     * The amount of time a videoconference can continue after the host has departed. Expressed as a standard duration type in XML. For example, P1H30M denotes 1 hour 15 minutes. The string is composed as follows: • P is at the start of the string (mandatory) indicating the period of time. • nY indicates the number of years. • nM indicates the number of months. • nD indicates the number of days. • T indicates the start of the time section (mandatory if specifying a time). • nH indicates the number of hours. • nM indicates the number of minutes. • nS indicates the number of seconds.
     */
    @XmlElement(name = "durationAfterLeft")
    protected Duration durationAfterLeft;

    /**
     * The conditions under which a videoconference automatically ends. Possible values are: • NORMAL indicates the videoconference automatically ends according to the system's default meeting settings. • AFTER_ALL_PARTIES_LEFT indicates the videoconference automatically ends when all participants have exited. • AFTER_HOST_LEFT indicates the videoconference automatically ends when the host exits from the meeting
     */
    @XmlElement(name = "terminationCondition")
    protected String terminationCondition;

    /**
     * The maximum number of participants allowed in this videoconference.
     */
    @XmlElement(name = "maxParticipants")
    protected Integer maxParticipants;

    /**
     * For NORMAL termination condition time in minutes before termination alert.
     */
    @XmlElement(name = "minutesBeforeTermination")
    protected Duration minutesBeforeTermination;



    public AdvancedProperties() {
        // constructor for Jackson
    }

    public Duration getDurationAfterLeft() {
        return durationAfterLeft;
    }

    public void setDurationAfterLeft(Duration durationAfterLeft) {
        this.durationAfterLeft = durationAfterLeft;
    }

    public String getTerminationCondition() {
        return terminationCondition;
    }

    public void setTerminationCondition(String terminationCondition) {
        this.terminationCondition = terminationCondition;
    }

    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public Duration getMinutesBeforeTermination() {
        return minutesBeforeTermination;
    }

    public void setMinutesBeforeTermination(Duration minutesBeforeTermination) {
        this.minutesBeforeTermination = minutesBeforeTermination;
    }

    @Override
    public String toString() {
        return "AdvancedProperties [durationAfterLeft=" + durationAfterLeft + ", terminationCondition="
                + terminationCondition + ", maxParticipants=" + maxParticipants + ", minutesBeforeTermination="
                + minutesBeforeTermination + "]";
    }
}
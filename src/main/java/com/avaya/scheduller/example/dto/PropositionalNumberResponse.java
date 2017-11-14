package com.avaya.scheduller.example.dto;



public class PropositionalNumberResponse {
    /**
     * The proposed number to be used during instant meeting schedulling
     */
    private String number;
    /**
     * Integer, proposed prefix for meeting
     */
    private String virtualMeetingIDPrefix;
    /**
     * Integer, minimum length of meeting
     */
    private int minimumMeetingIDLength;
    /**
     * Integer,default duration of meeting in minutes
     */
    private int defaultDuration;
    /**
     * String [ "DIAL_OUT" | "DIAL_IN" ] dialing mode
     */
    private String defaultDialMode;
    /**
     * String, ["SCHEDULE_END_TIME" | "ALL_ENDPOINT_LEFT"] termination type:
     */
    private String termination;

    public PropositionalNumberResponse() {// NOSONAR
    }



    public String getVirtualMeetingIDPrefix() {
        return virtualMeetingIDPrefix;
    }

    public void setVirtualMeetingIDPrefix(String virtualMeetingIDPrefix) {
        this.virtualMeetingIDPrefix = virtualMeetingIDPrefix;
    }

    public int getMinimumMeetingIDLength() {
        return minimumMeetingIDLength;
    }

    public void setMinimumMeetingIDLength(int minimumMeetingIDLength) {
        this.minimumMeetingIDLength = minimumMeetingIDLength;
    }

    public int getDefaultDuration() {
        return defaultDuration;
    }

    public void setDefaultDuration(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public String getDefaultDialMode() {
        return defaultDialMode;
    }

    public void setDefaultDialMode(String defaultDialMode) {
        this.defaultDialMode = defaultDialMode;
    }

    public String getTermination() {
        return termination;
    }

    public void setTermination(String termination) {
        this.termination = termination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PropositionalNumberResponse{" + "number='" + number + '\'' + ", virtualMeetingIDPrefix='"
                + virtualMeetingIDPrefix + '\'' + ", minimumMeetingIDLength=" + minimumMeetingIDLength
                + ", defaultDuration=" + defaultDuration + ", defaultDialMode='" + defaultDialMode + '\''
                + ", termination='" + termination + '\'' + '}';
    }
}

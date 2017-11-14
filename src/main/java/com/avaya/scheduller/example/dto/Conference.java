package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.Duration;















public class Conference {
    protected String memberId;
    protected String userId;
    protected String number;
    protected byte[] accessPIN;
    protected byte[] moderatorPIN;
    protected String serviceTemplateId;
    protected String servicePrefix;
    protected String allowStreaming;
    protected String priority;
    protected String streamingStatus;
    protected List<Attendee> attendees = new ArrayList<>();
    protected ReservedPorts reservedPorts;
    protected Boolean blockDialIn;
    protected Boolean autoExtend;
    protected Boolean waitingRoom;
    protected AdvancedProperties advancedProperties;
    protected Boolean oneTimePINRequired;
    protected String conferenceId;
    protected String status;
    protected String description;
    protected String subject;
    protected String startTime;
    protected String timeZoneId;
    protected String earlyTime;
    protected String plannedEndTime;
    protected Duration duration;
    protected String locationId;
    protected Boolean testOnly;
    protected Boolean sendingNotification;
    protected Boolean recordingMeetingWhenStart;
    protected Daily daily;
    protected Weekly weekly;
    protected Monthly monthly;
    protected RecurrenceEndType recurrenceEnd;
    protected BroadcastSetting broadcastSetting;
    protected String recurrenceId;
    protected LayoutInfo mainVideoLayout;
    protected LayoutInfo customerVideoLayout;


    public Conference() {
        // default constructor for Jackson
    }

    public String getRecurrenceId() {
        return recurrenceId;
    }

    public void setRecurrenceId(String recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public LayoutInfo getMainVideoLayout() {
        return mainVideoLayout;
    }

    public void setMainVideoLayout(LayoutInfo mainVideoLayout) {
        this.mainVideoLayout = mainVideoLayout;
    }

    public LayoutInfo getCustomerVideoLayout() {
        return customerVideoLayout;
    }

    public void setCustomerVideoLayout(LayoutInfo customerVideoLayout) {
        this.customerVideoLayout = customerVideoLayout;
    }

    public String getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }



    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getServiceTemplateId() {
        return serviceTemplateId;
    }

    public void setServiceTemplateId(String serviceTemplateId) {
        this.serviceTemplateId = serviceTemplateId;
    }

    public String getServicePrefix() {
        return servicePrefix;
    }

    public void setServicePrefix(String servicePrefix) {
        this.servicePrefix = servicePrefix;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStreamingStatus() {
        return streamingStatus;
    }

    public void setStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    public void setStreamingStatusType(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEarlyTime() {
        return earlyTime;
    }

    public void setEarlyTime(String earlyTime) {
        this.earlyTime = earlyTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Boolean isRecordingMeetingWhenStart() {
        return recordingMeetingWhenStart;
    }

    public void setRecordingMeetingWhenStart(Boolean recordingMeetingWhenStart) {
        this.recordingMeetingWhenStart = recordingMeetingWhenStart;
    }

    public byte[] getAccessPIN() {
        return accessPIN;
    }

    public void setAccessPIN(byte[] accessPIN) {
        this.accessPIN = accessPIN;
    }

    public byte[] getModeratorPIN() {
        return moderatorPIN;
    }

    public void setModeratorPIN(byte[] moderatorPIN) {
        this.moderatorPIN = moderatorPIN;
    }

    public String getAllowStreaming() {
        return allowStreaming;
    }

    public void setAllowStreaming(String allowStreaming) {
        this.allowStreaming = allowStreaming;
    }

    public ReservedPorts getReservedPorts() {
        return reservedPorts;
    }

    public void setReservedPorts(ReservedPorts reservedPorts) {
        this.reservedPorts = reservedPorts;
    }

    public Boolean getBlockDialIn() {
        return blockDialIn;
    }

    public void setBlockDialIn(Boolean blockDialIn) {
        this.blockDialIn = blockDialIn;
    }

    public Boolean getAutoExtend() {
        return autoExtend;
    }

    public void setAutoExtend(Boolean autoExtend) {
        this.autoExtend = autoExtend;
    }

    public Boolean getWaitingRoom() {
        return waitingRoom;
    }

    public void setWaitingRoom(Boolean waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    public AdvancedProperties getAdvancedProperties() {
        return advancedProperties;
    }

    public void setAdvancedProperties(AdvancedProperties advancedProperties) {
        this.advancedProperties = advancedProperties;
    }

    public Boolean getOneTimePINRequired() {
        return oneTimePINRequired;
    }

    public void setOneTimePINRequired(Boolean oneTimePINRequired) {
        this.oneTimePINRequired = oneTimePINRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public Weekly getWeekly() {
        return weekly;
    }

    public void setWeekly(Weekly weekly) {
        this.weekly = weekly;
    }

    public Monthly getMonthly() {
        return monthly;
    }

    public void setMonthly(Monthly monthly) {
        this.monthly = monthly;
    }

    public RecurrenceEndType getRecurrenceEnd() {
        return recurrenceEnd;
    }

    public void setRecurrenceEnd(RecurrenceEndType recurrenceEnd) {
        this.recurrenceEnd = recurrenceEnd;
    }

    public Boolean getTestOnly() {
        return testOnly;
    }

    public void setTestOnly(Boolean testOnly) {
        this.testOnly = testOnly;
    }

    public Boolean getSendingNotification() {
        return sendingNotification;
    }

    public void setSendingNotification(Boolean sendingNotification) {
        this.sendingNotification = sendingNotification;
    }

    /**
     * @return the broadcastSetting
     */
    public BroadcastSetting getBroadcastSetting() {
        return broadcastSetting;
    }

    /**
     * @param broadcastSetting the broadcastSetting to set
     */
    public void setBroadcastSetting(BroadcastSetting broadcastSetting) {
        this.broadcastSetting = broadcastSetting;
    }

    @Override
    public String toString() {
        return "Conference [memberId=" + memberId + ", userId=" + userId
                + ", number=" + number + ", serviceTemplateId="
                + serviceTemplateId + ", servicePrefix=" + servicePrefix
                + ", allowStreaming=" + allowStreaming + ", priority="
                + priority + ", streamingStatus=" + streamingStatus
                + ", attendees=" + attendees + ", reservedPorts=" + reservedPorts
                + ", blockDialIn=" + blockDialIn + ", autoExtend=" + autoExtend
                + ", waitingRoom=" + waitingRoom + ", advancedProperties="
                + advancedProperties + ", conferenceId=" + conferenceId
                + ", status=" + status + ", description=" + description
                + ", subject=" + subject + ", startTime=" + startTime
                + ", timeZoneId=" + timeZoneId + ", earlyTime=" + earlyTime
                + ", plannedEndTime=" + plannedEndTime + ", duration="
                + duration + ", locationId=" + locationId + ", testOnly="
                + testOnly + ", sendingNotification=" + sendingNotification
                + ", recordingMeetingWhenStart=" + recordingMeetingWhenStart
                + ", daily=" + daily + ", weekly=" + weekly + ", monthly="
                + monthly + ", recurrenceEnd=" + recurrenceEnd
                + ", broadcastSetting=" + broadcastSetting + ", recurrenceId="
                + recurrenceId + "]";
    }
}
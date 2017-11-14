package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class VirtualRoom {
    @XmlElement(name = "memberId")
    protected String memberId;
    @XmlElement(name = "userId")
    protected String userId;
    @XmlElement(name = "number")
    protected String number;
    @XmlElement(name = "accessPIN")
    protected byte[] accessPIN;
    @XmlElement(name = "moderatorPIN")
    protected byte[] moderatorPIN;
    @XmlElement(name = "serviceTemplateId")
    protected String serviceTemplateId;
    @XmlElement(name = "servicePrefix")
    protected String servicePrefix;
    @XmlElement(name = "priority")
    protected String priority;
    @XmlElement(name = "allowStreaming")
    protected String allowStreaming;
    @XmlElement(name = "streamingStatus")
    protected String streamingStatus;
    @XmlElement(name = "blockDialIn")
    protected Boolean blockDialIn;
    @XmlElement(name = "autoExtend")
    protected Boolean autoExtend;
    @XmlElement(name = "waitingRoom")
    protected Boolean waitingRoom;
    @XmlElement(name = "oneTimePINRequired")
    protected Boolean oneTimePINRequired;
    @XmlElement(name = "virtualRoomId")
    protected String virtualRoomId;
    @XmlElement(name = "name")
    protected String name;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "public")
    protected Boolean publiclyVisible;
    @XmlElement(name = "default")
    protected Boolean defaultVR;
    @XmlElement(name = "maxParticipants")
    protected String maxParticipants;
    @XmlElement(name = "allowRecording")
    protected String allowRecording;
    @XmlElement(name = "allowKnocking")
    protected Boolean allowKnocking;
    @XmlElement(name = "reservedPorts")
    protected ReservedPorts reservedPorts;
    @XmlElement(name = "advancedProperties")
    protected AdvancedProperties advancedProperties;
    @XmlElement(name = "attendees")
    protected List<Attendee> attendee = new ArrayList<Attendee>();

    public VirtualRoom() {
        // constructor for Jackson
    }


    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     *            the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     *            the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
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

    /**
     * @return the accessPIN
     */
    public byte[] getAccessPIN() {
        return accessPIN;
    }

    /**
     * @param accessPIN
     *            the accessPIN to set
     */
    public void setAccessPIN(byte[] accessPIN) {
        this.accessPIN = accessPIN;
    }

    /**
     * @return the moderatorPIN
     */
    public byte[] getModeratorPIN() {
        return moderatorPIN;
    }

    /**
     * @param moderatorPIN
     *            the moderatorPIN to set
     */
    public void setModeratorPIN(byte[] moderatorPIN) {
        this.moderatorPIN = moderatorPIN;
    }

    /**
     * @return the serviceTemplateId
     */
    public String getServiceTemplateId() {
        return serviceTemplateId;
    }

    /**
     * @param serviceTemplateId
     *            the serviceTemplateId to set
     */
    public void setServiceTemplateId(String serviceTemplateId) {
        this.serviceTemplateId = serviceTemplateId;
    }

    /**
     * @return the servicePrefix
     */
    public String getServicePrefix() {
        return servicePrefix;
    }

    /**
     * @param servicePrefix
     *            the servicePrefix to set
     */
    public void setServicePrefix(String servicePrefix) {
        this.servicePrefix = servicePrefix;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority
     *            the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the allowStreaming
     */
    public String getAllowStreaming() {
        return allowStreaming;
    }

    /**
     * @param allowStreaming
     *            the allowStreaming to set
     */
    public void setAllowStreaming(String allowStreaming) {
        this.allowStreaming = allowStreaming;
    }

    /**
     * @return the streamingStatus
     */
    public String getStreamingStatus() {
        return streamingStatus;
    }

    /**
     * @param streamingStatus
     *            the streamingStatus to set
     */
    public void setStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    /**
     * @return the blockDialIn
     */
    public Boolean getBlockDialIn() {
        return blockDialIn;
    }

    /**
     * @param blockDialIn
     *            the blockDialIn to set
     */
    public void setBlockDialIn(Boolean blockDialIn) {
        this.blockDialIn = blockDialIn;
    }

    /**
     * @return the autoExtend
     */
    public Boolean getAutoExtend() {
        return autoExtend;
    }

    /**
     * @param autoExtend
     *            the autoExtend to set
     */
    public void setAutoExtend(Boolean autoExtend) {
        this.autoExtend = autoExtend;
    }

    /**
     * @return the waitingRoom
     */
    public Boolean getWaitingRoom() {
        return waitingRoom;
    }

    /**
     * @param waitingRoom
     *            the waitingRoom to set
     */
    public void setWaitingRoom(Boolean waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    /**
     * @return the oneTimePINRequired
     */
    public Boolean getOneTimePINRequired() {
        return oneTimePINRequired;
    }

    /**
     * @param oneTimePINRequired
     *            the oneTimePINRequired to set
     */
    public void setOneTimePINRequired(Boolean oneTimePINRequired) {
        this.oneTimePINRequired = oneTimePINRequired;
    }

    /**
     * @return the virtualRoomId
     */
    public String getVirtualRoomId() {
        return virtualRoomId;
    }

    /**
     * @param virtualRoomId
     *            the virtualRoomId to set
     */
    public void setVirtualRoomId(String virtualRoomId) {
        this.virtualRoomId = virtualRoomId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the publiclyVisible
     */
    public Boolean getPubliclyVisible() {
        return publiclyVisible;
    }

    /**
     * @param publiclyVisible
     *            the publiclyVisible to set
     */
    public void setPubliclyVisible(Boolean publiclyVisible) {
        this.publiclyVisible = publiclyVisible;
    }

    /**
     * @return the defaultVR
     */
    public Boolean getDefaultVR() {
        return defaultVR;
    }

    /**
     * @param defaultVR
     *            the defaultVR to set
     */
    public void setDefaultVR(Boolean defaultVR) {
        this.defaultVR = defaultVR;
    }

    /**
     * @return the maxParticipants
     */
    public String getMaxParticipants() {
        return maxParticipants;
    }

    /**
     * @param maxParticipants
     *            the maxParticipants to set
     */
    public void setMaxParticipants(String maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    /**
     * @return the allowRecording
     */
    public String getAllowRecording() {
        return allowRecording;
    }

    /**
     * @param allowRecording
     *            the allowRecording to set
     */
    public void setAllowRecording(String allowRecording) {
        this.allowRecording = allowRecording;
    }

    /**
     * @return the allowKnocking
     */
    public Boolean getAllowKnocking() {
        return allowKnocking;
    }

    /**
     * @param allowKnocking
     *            the allowKnocking to set
     */
    public void setAllowKnocking(Boolean allowKnocking) {
        this.allowKnocking = allowKnocking;
    }

    /**
     * @return the reservedPorts
     */
    public ReservedPorts getReservedPorts() {
        return reservedPorts;
    }

    /**
     * @param reservedPorts
     *            the reservedPorts to set
     */
    public void setReservedPorts(ReservedPorts reservedPorts) {
        this.reservedPorts = reservedPorts;
    }

    /**
     * @return the advancedProperties
     */
    public AdvancedProperties getAdvancedProperties() {
        return advancedProperties;
    }

    /**
     * @param advancedProperties
     *            the advancedProperties to set
     */
    public void setAdvancedProperties(AdvancedProperties advancedProperties) {
        this.advancedProperties = advancedProperties;
    }

    /**
     * @return the attendees
     */
    public List<Attendee> getAttendee() {
        return attendee;//NOSONAR DAO can have mutable collections, otherwise it can impact performance
    }

    /**
     * @param attendee
     *            the attendees to set
     */
    public void setAttendee(List<Attendee> attendee) {
        this.attendee = attendee;//NOSONAR DAO can have mutable collections, otherwise it can impact performance
    }

    @Override
    public String toString() {
        return "VirtualRoom [memberId=" + memberId + ", userId=" + userId + ", number=" + number + ", accessPIN="
                + accessPIN + ", moderatorPIN=" + moderatorPIN + ", serviceTemplateId=" + serviceTemplateId
                + ", servicePrefix=" + servicePrefix + ", priority=" + priority + ", allowStreaming=" + allowStreaming
                + ", streamingStatus=" + streamingStatus + ", blockDialIn=" + blockDialIn + ", autoExtend=" + autoExtend
                + ", waitingRoom=" + waitingRoom + ", oneTimePINRequired=" + oneTimePINRequired + ", virtualRoomId="
                + virtualRoomId + ", name=" + name + ", description=" + description + ", public=" + publiclyVisible
                + ", default=" + defaultVR + ", maxParticipants=" + maxParticipants + ", allowRecording="
                + allowRecording + ", allowKnocking=" + allowKnocking + ", reservedPorts=" + reservedPorts
                + ", advancedProperties=" + advancedProperties + ", attendees=" + attendee + "]";
    }

}

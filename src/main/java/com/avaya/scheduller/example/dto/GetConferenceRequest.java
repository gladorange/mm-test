package com.avaya.scheduller.example.dto;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlRootElement
public class GetConferenceRequest {
    private static final int SEARCH_CONFERENCE_DEFAULT_COUNT = Integer.getInteger("com.avaya.ups.conference"
            + ".default-search-count",500);
    @XmlElement(name = "memberId")
    protected String memberId;
    @XmlElement(name = "userId")
    protected String userId;
    @XmlElement(name = "conferenceId")
    protected String conferenceId;
    @XmlElement(name = "startTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "endTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "subject")
    protected String subject;
    @XmlElement(name = "status")
    protected String status;
    @XmlElement(name = "number")
    protected String number;
    @XmlElement(name = "recurringStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurringStartTime;
    @XmlElement(name = "detailed")
    protected Boolean detailed;
    @XmlElement(name = "textToSearch")
    private String textToSearch;
    @XmlElement(name = "offset")
    protected Integer offset;
    @XmlElement(name = "count")
    protected Integer count;

    public GetConferenceRequest() {
        // constructor for Jackson
    }

    public String getTextToSearch() {
        return textToSearch;
    }

    public void setTextToSearch(String textToSearch) {
        this.textToSearch = textToSearch;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    public void setStartTime(XMLGregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    public void setEndTime(XMLGregorianCalendar endTime) {
        this.endTime = endTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public XMLGregorianCalendar getRecurringStartTime() {
        return recurringStartTime;
    }

    public void setRecurringStartTime(XMLGregorianCalendar recurringStartTime) {
        this.recurringStartTime = recurringStartTime;
    }

    public Boolean getDetailed() {
        return detailed;
    }

    public void setDetailed(Boolean detailed) {
        this.detailed = detailed;
    }

    @Override
    public String toString() {
        return "GetConferenceRequest [memberId=" + memberId + ", userId=" + userId + ", conferenceId=" + conferenceId
                + ", startTime=" + startTime + ", endTime=" + endTime + ", subject=" + subject + ", status=" + status
                + ", number=" + number + ", recurringStartTime=" + recurringStartTime + ", detailed=" + detailed + "]";
    }
}

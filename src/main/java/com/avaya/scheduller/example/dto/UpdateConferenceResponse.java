package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name = "report")
public class UpdateConferenceResponse {
    @XmlElement(name = "success")
    protected boolean success;
    @XmlElement(name = "errorCode")
    protected String errorCode;
    @XmlElement(name = "conflictInfo")
    protected List<ConflictInfo> conflictInfos = new ArrayList<>();
    @XmlElement(name = "detail")
    protected String detail;
    @XmlElement(name = "conferenceId")
    protected String conferenceId;
    @XmlElement(name = "number")
    protected String number;


    public UpdateConferenceResponse() {
        // constructor for Jackson

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<ConflictInfo> getConflictInfos() {
        return conflictInfos;
    }

    public void setConflictInfos(List<ConflictInfo> conflictInfos) {
        this.conflictInfos = conflictInfos;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "UpdateConferenceResponse [success=" + success + ", errorCode=" + errorCode + ", conflictInfos="
                + conflictInfos + ", detail=" + detail + ", conferenceId=" + conferenceId + ", number=" + number + "]";
    }
}

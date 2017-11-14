package com.avaya.scheduller.example.dto.v2;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import com.avaya.scheduller.example.dto.ConflictInfo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;





@JsonAutoDetect(fieldVisibility= Visibility.ANY, getterVisibility= Visibility.NONE, isGetterVisibility= Visibility.NONE, setterVisibility= Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateConferenceResponseV2 {
    /**
     * Boolean indicating success
     */
    protected boolean success;
    protected String errorCode;
    /**
     * Container with possible conflict errors
     */
    protected List<ConflictInfo> conflictInfos = new ArrayList<>();
    protected String detail;
    /**
     * Id of conference
     */
    protected String conferenceId;
    protected String panelistNumber;
    protected String status;
    /**
     * Conference number
     */
    protected String number;
    /**
     * For recurring conferences  - container with status for every scheduled conference
     */
    protected List<RecurringItemUpsReport> recurringItemReports;

    /**
     * Direct URL which should be used by moderator to join this meeting. Note, that participant name should be
     * replaced (&displayName=[ToBeReplaced])
     */
    @JsonProperty("swcLaunchURLforModerator")
    protected String swcLaunchURLforModerator;

    /**
     * Direct URL which should be used by regular participant to join this meeting. Note, that participant name should
     * be
     * replaced (&displayName=[ToBeReplaced])
     */
    @JsonProperty("swcLaunchURLforParticipant")
    protected String swcLaunchURLforParticipant;

    public UpdateConferenceResponseV2() {
        // constructor for Jackson

    }



    public List<RecurringItemUpsReport> getRecurringItemReports() {
        return recurringItemReports;
    }

    public void setRecurringItemReports(List<RecurringItemUpsReport> recurringItemReports) {
        this.recurringItemReports = recurringItemReports;
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

    public String getPanelistNumber() {
        return panelistNumber;
    }

    public void setPanelistNumber(String panelistNumber) {
        this.panelistNumber = panelistNumber;
    }

    public String getSwcLaunchURLforModerator() {
        return swcLaunchURLforModerator;
    }

    public void setSwcLaunchURLforModerator(String swcLaunchURLforModerator) {
        this.swcLaunchURLforModerator = swcLaunchURLforModerator;
    }

    public String getSwcLaunchURLforParticipant() {
        return swcLaunchURLforParticipant;
    }

    public void setSwcLaunchURLforParticipant(String swcLaunchURLforParticipant) {
        this.swcLaunchURLforParticipant = swcLaunchURLforParticipant;
    }

    @Override
    public String toString() {
        return "UpdateConferenceResponse [success=" + success + ", errorCode=" + errorCode + ", conflictInfos="
                + conflictInfos + ", detail=" + detail + ", conferenceId=" + conferenceId + ", number=" + number
                + ", panelistNumber=" + panelistNumber + "]";
    }

    public static class RecurringItemUpsReport {
        private Boolean success;
        private Boolean available;
        private String startTime;
        private String errorCode;
        private String detail;



        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Boolean getAvailable() {
            return available;
        }

        public void setAvailable(Boolean available) {
            this.available = available;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }
    }
}

package com.avaya.scheduller.example.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name = "telepresence")
public class Telepresence {
    /**
     * Internal ID assigned to all the segments of this telepresence endpoint
     */
    @XmlElement(name = "tpId", required = true)
    protected String tpId;
    @XmlElement(name = "templateId", required = true)
    /**
     * Defines the telepresence model. Possible values are:
     • TP_SCOPIA_XT indicates the Scopia ® XT Telepresence.
     • TP_LIFESIZE_CONFERENCE_200
     • TP_POLYCOM_RPX_200
     • TP_POLYCOM_RPX_400
     • TP_TANDBERG_T3
     • TP_GENERIC indicates a telepresence endpoint not present in this list.
     */
    protected String templateId;
    /**
     * BOOL indicating if this telepresence system has three cameras, three codec units
     and three monitors.
     */
    @XmlElement(name = "triple")
    protected boolean triple;
    /**
     * BOOL indicating if the output image is crossed between the left and right hand side
     codec signals.
     */
    @XmlElement(name = "crossVideo")
    protected boolean crossVideo;
    /**
     * Container element for the number to be dialed for each segment of this
     telepresence system.
     */
    @XmlElement(name = "segment")
    protected List<TerminalSegments> segments;


    public Telepresence() {
        //for Jackson
    }

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public boolean isTriple() {
        return triple;
    }

    public void setTriple(boolean triple) {
        this.triple = triple;
    }

    public boolean isCrossVideo() {
        return crossVideo;
    }

    public void setCrossVideo(boolean crossVideo) {
        this.crossVideo = crossVideo;
    }

    public List<TerminalSegments> getSegments() {
        return segments;
    }

    public void setSegments(List<TerminalSegments> segments) {
        this.segments = segments;
    }

    @XmlRootElement(name = "segments")
    public static class TerminalSegments {
        /**
         * Number to be dialed to reach a given segment of this telepresence system. For the
         primary segment of the telepresence system, this field is the same as
         TerminalNumber.
         */
        @XmlElement(name = "number", required = true)
        protected String number;

        public TerminalSegments() {

        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    @Override
    public String toString() {
        return "Telepresence [tpId=" + tpId + ", templateId=" + templateId + ", triple=" + triple + ", crossVideo="
                + crossVideo + ", segments=" + segments + "]";
    }
}

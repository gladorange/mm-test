/****************************************************************************
 * Copyright 2016 Avaya Inc., All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Avaya Inc.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 * Some third-party source code components may have been modified from their
 * original versions by Avaya Inc.
 * The modifications are Copyright 2015 Avaya Inc., All Rights Reserved.
 * Avaya - Confidential & Restricted. May not be distributed further without
 * written permission of the Avaya owner.
 ****************************************************************************/
package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * Broadcast setting object
 * 
 * @author rodind
 *
 */
@XmlRootElement
public class BroadcastSetting {
    /**
     * subject of broadcast
     */
    @XmlElement(name = "subject")
    protected String subject;
    /**
     * pin to join to this broadcast
     */
    @XmlElement(name = "pin")
    protected String pin;

    /**
     * The thumbnail file. It is base 64 encoded octet stream with the file content. See this fiddle to encode file as base64 http://jsfiddle.net/eliseosoto/JHQnk/
     */
    @XmlElement(name = "thumbnail")
    protected String thumbnail;
    @XmlElement(name = "thumbnailMimeType")
    protected String thumbnailMimeType;
    @XmlElement(name = "profile")
    protected String profile;
    /**
     * Description of broadcast
     */
    @XmlElement(name = "description")
    protected String description;
    /**
     * unique id for broadcast. Note: this ID should be geenrated on UPC. Use UUID generator to do this. This id should by unique. If id is not unique - error will be return.
     */
    @XmlElement(name = "programId")
    protected String programId;
    /**
     *  means whether or not to show it in the portal. Applicable, only if user has access to this video.
     */
    @XmlElement(name = "public")
    protected Boolean publicBroadcast;
    /**
     * Is Q&A feature enabled
     */
    @XmlElement(name = "questionsAndAnswersEnabled")
    protected Boolean questionsAndAnswersEnabled;
    /**
     * PIN for moderator
     */
    @XmlElement(name = "moderatorPIN")
    protected String moderatorPIN;
    /**
     * Container to store access related settings
     */
    @XmlElement(name = "accessModeSetting")
    protected AccessModeSettings accessModeSettings;

    public BroadcastSetting() {
        // default constructor for Jackson
    }



    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     *            the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin
     *            the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail
     *            the thumbnail to set
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return the thumbnailMimeType
     */
    public String getThumbnailMimeType() {
        return thumbnailMimeType;
    }

    /**
     * @param thumbnailMimeType
     *            the thumbnailMimeType to set
     */
    public void setThumbnailMimeType(String thumbnailMimeType) {
        this.thumbnailMimeType = thumbnailMimeType;
    }

    /**
     * @return the profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * @param profile
     *            the profile to set
     */
    public void setProfile(String profile) {
        this.profile = profile;
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
     * @return the programId
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * @param programId
     *            the programId to set
     */
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    /**
     * @return the publicBroadcast
     */
    public Boolean getPublicBroadcast() {
        return publicBroadcast;
    }

    /**
     * @param publicBroadcast
     *            the publicBroadcast to set
     */
    public void setPublicBroadcast(Boolean publicBroadcast) {
        this.publicBroadcast = publicBroadcast;
    }

    /**
     * @return the questionsAndAnswersEnabled
     */
    public Boolean getQuestionsAndAnswersEnabled() {
        return questionsAndAnswersEnabled;
    }

    /**
     * @param questionsAndAnswersEnabled
     *            the questionsAndAnswersEnabled to set
     */
    public void setQuestionsAndAnswersEnabled(Boolean questionsAndAnswersEnabled) {
        this.questionsAndAnswersEnabled = questionsAndAnswersEnabled;
    }

    /**
     * @return the moderatorPIN
     */
    public String getModeratorPIN() {
        return moderatorPIN;
    }

    /**
     * @param moderatorPIN
     *            the moderatorPIN to set
     */
    public void setModeratorPIN(String moderatorPIN) {
        this.moderatorPIN = moderatorPIN;
    }

    /**
     * @return the accessModeSettings
     */
    public AccessModeSettings getAccessModeSettings() {
        return accessModeSettings;
    }

    /**
     * @param accessModeSettings
     *            the accessModeSettings to set
     */
    public void setAccessModeSettings(AccessModeSettings accessModeSettings) {
        this.accessModeSettings = accessModeSettings;
    }

    @Override
    public String toString() {
        return "BroadcastSetting [subject=" + subject + ", thumbnail=" + thumbnail + ", thumbnailMimeType="
                + thumbnailMimeType + ", profile=" + profile + ", description=" + description + ", programId="
                + programId + ", public=" + publicBroadcast + ", questionsAndAnswersEnabled="
                + questionsAndAnswersEnabled + ", accessModeSettings=" + accessModeSettings + "]";
    }

}

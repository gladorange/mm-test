package com.avaya.scheduller.example.dto.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;





@JsonInclude(Include.NON_NULL)
public class TerminalV2 {
    protected String memberId;
    /**
     * The ID of an endpoint defined in Scopia® Management. For the list of endpoints and/or an endpoint's details, see Get Terminal
     */
    protected String terminalId;
    /**
     * The name of the endpoint as defined within Scopia® Management
     */
    protected String terminalName;
    /**
     * Endpoint description
     */
    protected String description;

    /**
     * The SIP or H.323 dial string used to reach this endpoint. This can be used for both internal endpoints registered within Scopia® Management, or external endpoints. For external endpoints, the number is its primary identifier.
     */
    protected String terminalNumber;
    /**
     * The maximum bandwidth available for this endpoint. Optional, since the service (meeting type) also defines bandwidth limitations
     */
    protected Integer maxBandwidth;
    /**
     * The maximum bandwidth available over an ISDN or mobile connection
     */
    protected Integer maxISDNBandwidth;
    /**
     * Area code for dialing this endpoint, when it is an ISDN or 3G endpoint.
     */
    protected String areaCode;
    /**
     * Country code for dialing this endpoint, when it is an ISDN or 3G endpoint.
     */
    protected String countryCode;
    /**
     * Telephone number to dial this endpoint, when it is an ISDN or 3G endpoint
     */
    protected String telephoneNumber;
    /**
     * BOOL indicating whether this is a 3G endpoint.
     */
    protected Boolean threeG = false;

    protected Boolean autoDialIn = false;

    /**
     * Determines whether this endpoint operates in restricted mode, where the top 8K of each packet is reserved by the ISDN PBX for control data. For ISDN endpoints only.
     */
    protected Boolean restrictedMode = false;
    /**
     * The video capabilities of the connected endpoint. Possible values are:
     • Disabled for audio only capabilities.
     • SD indicates Standard Definition. For H.264 connections, use a maximum
     resolution of 480p. For H.263 connections, use a maximum resolution of 4CIF
     at 30 fps.
     • HDCP for high definition video continuous presence, up to 720p at 30 fps.
     • FullHDCP at 1080p at 30 fps, or 720p at 60 fps.
     • 3G indicates the invited endpoint is a 3G-324M-based mobile device.
     • Unknown indicates to use the videoconference default, taking the maximum
     resolution and maximum bit rate from the meeting settings
     */
    protected String videoProfile;
    /**
     * BOOL indicating whether this is a voice-only endpoint
     */
    protected Boolean voiceOnly = false;
    /**
     * The gatekeeper ID to which this endpoint is registered.
     */
    protected String registerGKId;
    /**
     * The ID of the location as defined in Scopia ® Management. This field is often used
     for branches in an organization.
     */
    protected String locationId;
    /**
     * BOOL indicating if this endpoint is visible in the address book.
     */
    protected Boolean addressBookEnabled = false;

    public TerminalV2() {
        // constructor for Jackson
    }

    public Boolean getThreeG() {
        return threeG;
    }

    public Boolean getAutoDialIn() {
        return autoDialIn;
    }

    public void setAutoDialIn(Boolean autoDialIn) {
        this.autoDialIn = autoDialIn;
    }

    public Boolean getVoiceOnly() {
        return voiceOnly;
    }

    protected Boolean needOnMaster = false;

    public Boolean getNeedOnMaster() {
        return needOnMaster;
    }

    public void setNeedOnMaster(Boolean needOnMaster) {
        this.needOnMaster = needOnMaster;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public Integer getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public Integer getMaxISDNBandwidth() {
        return maxISDNBandwidth;
    }

    public void setMaxISDNBandwidth(Integer maxISDNBandwidth) {
        this.maxISDNBandwidth = maxISDNBandwidth;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Boolean isThreeG() {
        return threeG;
    }

    public void setThreeG(Boolean threeG) {
        this.threeG = threeG;
    }

    public Boolean getRestrictedMode() {
        return restrictedMode;
    }

    public void setRestrictedMode(Boolean restrictedMode) {
        this.restrictedMode = restrictedMode;
    }

    public String getVideoProfile() {
        return videoProfile;
    }

    public void setVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
    }

    public Boolean isVoiceOnly() {
        return voiceOnly;
    }

    public void setVoiceOnly(Boolean voiceOnly) {
        this.voiceOnly = voiceOnly;
    }

    public String getRegisterGKId() {
        return registerGKId;
    }

    public void setRegisterGKId(String registerGKId) {
        this.registerGKId = registerGKId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }


    public Boolean getAddressBookEnabled() {
        return addressBookEnabled;
    }

    public void setAddressBookEnabled(Boolean addressBookEnabled) {
        this.addressBookEnabled = addressBookEnabled;
    }



    @Override
    public String toString() {
        return "Terminal [memberId=" + memberId + ", terminalId=" + terminalId + ", terminalName=" + terminalName
                + ", description=" + description + ", protocol="  + ", terminalNumber=" + terminalNumber
                + ", maxBandwidth=" + maxBandwidth + ", maxISDNBandwidth=" + maxISDNBandwidth + ", areaCode=" + areaCode
                + ", countryCode=" + countryCode + ", telephoneNumber=" + telephoneNumber + ", threeG=" + threeG
                + ", restrictedMode=" + restrictedMode + ", videoProfile=" + videoProfile + ", voiceOnly=" + voiceOnly
                + ", registerGKId=" + registerGKId + ", locationId=" + locationId + ", addressBookEnabled="
                + addressBookEnabled + ", telepresence="  + ", needOnMaster="
                + ", autoDialIn="  + "]";
    }
}
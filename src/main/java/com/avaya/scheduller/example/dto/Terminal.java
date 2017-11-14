package com.avaya.scheduller.example.dto;






public class Terminal {

    protected String memberId;
    protected String terminalId;
    protected String terminalName;
    protected String description;
    protected Protocol protocol;
    protected String terminalNumber;
    protected Integer maxBandwidth;
    protected Integer maxISDNBandwidth;
    protected String areaCode;
    protected String countryCode;
    protected String telephoneNumber;
    protected Boolean threeG;
    protected Boolean restrictedMode;
    protected String videoProfile;
    protected Boolean voiceOnly;
    protected String registerGKId;
    protected String locationId;
    protected Boolean addressBookEnabled;
    protected Telepresence telepresence;
    protected Boolean needOnMaster;
    protected Boolean autoDialIn;
    protected PartyInLayout mainPartyInLayout;
    protected PartyInLayout customerPartyInLayout;
    protected PartyOutLayout partyOutLayout;

    public Terminal() {
        // constructor for Jackson
    }

    public PartyInLayout getMainPartyInLayout() {
        return mainPartyInLayout;
    }

    public void setMainPartyInLayout(PartyInLayout mainPartyInLayout) {
        this.mainPartyInLayout = mainPartyInLayout;
    }

    public PartyInLayout getCustomerPartyInLayout() {
        return customerPartyInLayout;
    }

    public void setCustomerPartyInLayout(PartyInLayout customerPartyInLayout) {
        this.customerPartyInLayout = customerPartyInLayout;
    }

    public PartyOutLayout getPartyOutLayout() {
        return partyOutLayout;
    }

    public void setPartyOutLayout(PartyOutLayout partyOutLayout) {
        this.partyOutLayout = partyOutLayout;
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

    /**
     * @return the protocol
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * @param protocol
     *            the protocol to set
     */
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
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

    public Telepresence getTelepresence() {
        return telepresence;
    }

    public void setTelepresence(Telepresence telepresence) {
        this.telepresence = telepresence;
    }

    public Boolean getAddressBookEnabled() {
        return addressBookEnabled;
    }

    public void setAddressBookEnabled(Boolean addressBookEnabled) {
        this.addressBookEnabled = addressBookEnabled;
    }

    public Boolean isNeedOnMaster() {
        return needOnMaster;
    }

    public void setNeedOnMaster(Boolean needOnMaster) {
        this.needOnMaster = needOnMaster;
    }

    public Boolean isAutoDialIn() {
        return autoDialIn;
    }

    public void setAutoDialIn(Boolean autoDialIn) {
        this.autoDialIn = autoDialIn;
    }

    @Override
    public String toString() {
        return "Terminal [memberId=" + memberId + ", terminalId=" + terminalId + ", terminalName=" + terminalName
                + ", description=" + description + ", protocol=" + protocol + ", terminalNumber=" + terminalNumber
                + ", maxBandwidth=" + maxBandwidth + ", maxISDNBandwidth=" + maxISDNBandwidth + ", areaCode=" + areaCode
                + ", countryCode=" + countryCode + ", telephoneNumber=" + telephoneNumber + ", threeG=" + threeG
                + ", restrictedMode=" + restrictedMode + ", videoProfile=" + videoProfile + ", voiceOnly=" + voiceOnly
                + ", registerGKId=" + registerGKId + ", locationId=" + locationId + ", addressBookEnabled="
                + addressBookEnabled + ", telepresence=" + telepresence + ", needOnMaster=" + needOnMaster
                + ", autoDialIn=" + autoDialIn + "]";
    }
}
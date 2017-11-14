package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class BroadcastProfileElement {
    @XmlElement(name = "profilesId")
    private String profilesId;
    @XmlElement(name = "profilesName")
    private String profilesName;



    public BroadcastProfileElement() {
        // constructor for Jackson

    }

    /**
     * @return the profilesId
     */
    public String getProfilesId() {
        return profilesId;
    }

    /**
     * @param profilesId
     *            the profilesId to set
     */
    public void setProfilesId(String profilesId) {
        this.profilesId = profilesId;
    }

    /**
     * @return the profilesName
     */
    public String getProfilesName() {
        return profilesName;
    }

    /**
     * @param profilesName
     *            the profilesName to set
     */
    public void setProfilesName(String profilesName) {
        this.profilesName = profilesName;
    }

    @Override
    public String toString() {
        return "BroadcastProfileElement [profilesId=" + profilesId + ", profilesName=" + profilesName + "]";
    }

}

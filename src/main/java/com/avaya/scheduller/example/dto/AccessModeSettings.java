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



/**
 * Access Mode Setting object
 * 
 * @author rodind
 *
 */
public class AccessModeSettings {
    /**
     * should be one of the following "Private/LimitedUsers/AllAuthedUsers/AllUsers",
     */
    @XmlElement(name = "accessMode")
    protected AccessModes accessModes;
    /**
     * ids of users, applicable only if accessMode is LimitedUsers
     */
    @XmlElement(name = "userIds")
    protected String userIds;

    public AccessModeSettings() {
        // default constructor for Jackson
    }


    /**
     * @return the accessModes
     */
    public AccessModes getAccessModes() {
        return accessModes;
    }

    /**
     * @param accessModes
     *            the accessModes to set
     */
    public void setAccessModes(AccessModes accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * @return the userIds
     */
    public String getUserIds() {
        return userIds;
    }

    /**
     * @param userIds
     *            the userIds to set
     */
    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    @Override
    public String toString() {
        return "AccessModeSetting [accessModes=" + accessModes + ", userIds=" + userIds + "]";
    }

}

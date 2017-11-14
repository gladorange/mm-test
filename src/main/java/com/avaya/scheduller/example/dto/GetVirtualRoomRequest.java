package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetVirtualRoomRequest {
    /**
     * The organization ID, required in service provider (multi-tenant) deployments only.
     */
    @XmlElement(name = "memberId")
    protected String memberId;
    /**
     *Number to dial to access this virtual room, without any prefixes which determine the meeting type.
     */
    @XmlElement(name = "dialableNumber")
    protected String dialableNumber;
    /**
     *  specifies the virtual room ID
     */
    @XmlElement(name = "virtualRoomId")
    protected String virtualRoomId;
    /**
     * specifies the virtual room name
     */
    @XmlElement(name = "virtualRoomName")
    protected String virtualRoomName;
    /**
     * The login username of the user associated with this record. This field is optional. You can provide either the LoginId or UserId, or to list all known items in this organization, leave both fields empty.
     */
    @XmlElement(name = "loginId")
    protected String loginId;
    /**
     * The internal ID of the participant's username for users.
     This field is optional. You can provide either the LoginId or UserId, or to list all known items in this organization, leave both fields empty
     */
    @XmlElement(name = "userId")
    protected String userId;
    /**
     * specifies the part of user's first or last name
     */
    @XmlElement(name = "partOfUserName")
    protected String partOfUserName;
    /**
     * In default, its value is 20. It defines list size in response. Response will contain the number of VRs defined by "pageSize".
     */
    @XmlElement(name = "pageSize")
    protected String pageSize;
    /**
     * In default, its value is 1. It defines starting position in virtual room list. Response will contain VR list starting from position defined by "offset".
     */
    @XmlElement(name = "offset")
    protected String offset;

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
     * @return the dialableNumber
     */
    public String getDialableNumber() {
        return dialableNumber;
    }

    /**
     * @param dialableNumber
     *            the dialableNumber to set
     */
    public void setDialableNumber(String dialableNumber) {
        this.dialableNumber = dialableNumber;
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
     * @return the virtualRoomName
     */
    public String getVirtualRoomName() {
        return virtualRoomName;
    }

    /**
     * @param virtualRoomName
     *            the virtualRoomName to set
     */
    public void setVirtualRoomName(String virtualRoomName) {
        this.virtualRoomName = virtualRoomName;
    }

    /**
     * @return the loginId
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * @param loginId
     *            the loginId to set
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
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
     * @return the partOfUserName
     */
    public String getPartOfUserName() {
        return partOfUserName;
    }

    /**
     * @param partOfUserName
     *            the partOfUserName to set
     */
    public void setPartOfUserName(String partOfUserName) {
        this.partOfUserName = partOfUserName;
    }

    /**
     * @return the pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the offset
     */
    public String getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "GetVirtualRoomRequest [memberId=" + memberId + ", dialableNumber=" + dialableNumber + ", virtualRoomId="
                + virtualRoomId + ", virtualRoomName=" + virtualRoomName + ", loginId =" + loginId + ", userId="
                + userId + ", partOfUserName=" + partOfUserName + ", pageSize=" + pageSize + ", offset=" + offset + "]]";
    }

}

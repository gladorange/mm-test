package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class GetVirtualRoomResponse {
    @XmlElement(name = "virtualRoom")
    protected List<VirtualRoom> virtualRooms = new ArrayList<VirtualRoom>();
    @XmlElement(name = "totalCount ")
    protected Integer totalCount = 0;
    @XmlElement(name = "records")
    protected List<Integer> records = new ArrayList<Integer>();

    public GetVirtualRoomResponse() {
        // constructor for Jackson
    }



    /**
     * @return the virtualRooms
     */
    public List<VirtualRoom> getVirtualRooms() {
        return virtualRooms;
    }

    /**
     * @param virtualRooms
     *            the virtualRooms to set
     */
    public void setVirtualRooms(List<VirtualRoom> virtualRooms) {
        this.virtualRooms = virtualRooms;
    }

    /**
     * @return the totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount
     *            the totalCount to set
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return the records
     */
    public List<Integer> getRecords() {
        return records;
    }

    /**
     * @param records
     *            the records to set
     */
    public void setRecords(List<Integer> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "GetVirtualRoomResponse [virtualRooms=" + virtualRooms + ", totalCount=" + totalCount + ", records="
                + records + "]]";
    }

}

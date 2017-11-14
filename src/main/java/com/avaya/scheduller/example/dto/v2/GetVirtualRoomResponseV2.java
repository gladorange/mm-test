package com.avaya.scheduller.example.dto.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class GetVirtualRoomResponseV2 {
    @XmlElement(name = "virtualRoom")
    protected List<VirtualRoomV2> virtualRooms = new ArrayList<>();
    /**
     * return total count of results
     */
    @XmlElement(name = "totalCount ")
    protected Integer totalCount = 0;
    /**
     * The array of start and end points in list of found virtual rooms.  "records": [ 2, 4],
     */
    @XmlElement(name = "records")
    protected List<Integer> records = new ArrayList<Integer>();

    public GetVirtualRoomResponseV2() {
        // constructor for Jackson
    }

    /**
     * @return the virtualRooms
     */
    public List<VirtualRoomV2> getVirtualRooms() {
        return virtualRooms;
    }

    /**
     * @param virtualRooms
     *            the virtualRooms to set
     */
    public void setVirtualRooms(List<VirtualRoomV2> virtualRooms) {
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

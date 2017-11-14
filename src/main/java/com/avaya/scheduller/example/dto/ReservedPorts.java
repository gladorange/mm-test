package com.avaya.scheduller.example.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "reservedPorts")
public class ReservedPorts {
    @XmlElement(name = "regular")
    private Integer regular;
    @XmlElement(name = "sd")
    private Integer sd;
    @XmlElement(name = "hd")
    private Integer hd;
    @XmlElement(name = "fullHD")
    private Integer fullHD;



    public ReservedPorts() {
        // constructor for Jackson

    }

    public Integer getRegular() {
        return regular;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }

    public Integer getSd() {
        return sd;
    }

    public void setSd(Integer sd) {
        this.sd = sd;
    }

    public Integer getHd() {
        return hd;
    }

    public void setHd(Integer hd) {
        this.hd = hd;
    }

    public Integer getFullHD() {
        return fullHD;
    }

    public void setFullHD(Integer fullHD) {
        this.fullHD = fullHD;
    }

    @Override
    public String toString() {
        return "ReservedPorts [regular=" + regular + ", sd=" + sd + ", hd=" + hd + ", fullHD=" + fullHD + "]";
    }
}
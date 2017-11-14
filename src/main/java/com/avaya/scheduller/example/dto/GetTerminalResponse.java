package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class GetTerminalResponse {
    @XmlElement(name = "terminal")
    protected List<Terminal> terminals = new ArrayList<Terminal>();



    public GetTerminalResponse() {
        //for Jackson
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    @Override
    public String toString() {
        return "GetTerminalResponse [terminals=" + terminals + "]";
    }
}

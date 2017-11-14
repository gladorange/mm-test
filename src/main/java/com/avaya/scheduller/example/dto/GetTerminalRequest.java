package com.avaya.scheduller.example.dto;

public class GetTerminalRequest {
    protected String number;
    protected String name;
    protected String terminalId;

    public GetTerminalRequest(String terminalId, String name, String number) {
        this.terminalId = terminalId;
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public String toString() {
        return "GetTerminalRequest [number=" + number + ", name=" + name + ", terminalId=" + terminalId + "]";
    }
}
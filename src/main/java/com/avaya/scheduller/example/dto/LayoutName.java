package com.avaya.scheduller.example.dto;



public enum LayoutName {
    MAIN("Main"), CUSTOMER("Customer");

    private final String value;

    LayoutName(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }




}

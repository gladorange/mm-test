package com.avaya.scheduller.example.dto;

import java.io.Serializable;



public class PartyOutLayout implements Serializable {
    private static final long serialVersionUID = 1L;
    protected LayoutName layoutName;

    public PartyOutLayout() {
    }



    public LayoutName getLayoutName() {
        return this.layoutName;
    }

    public void setLayoutName(LayoutName value) {
        this.layoutName = value;
    }

}

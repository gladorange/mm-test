package com.avaya.scheduller.example.dto;

import java.io.Serializable;




public class PartyInLayout implements Serializable {
    private static final long serialVersionUID = 1L;
    protected LayoutName layoutName;
    protected int positionId;

    public PartyInLayout() {
    }



    public LayoutName getLayoutName() {
        return this.layoutName;
    }

    public void setLayoutName(LayoutName value) {
        this.layoutName = value;
    }


    public int getPositionId() {
        return this.positionId;
    }

    public void setPositionId(int value) {
        this.positionId = value;
    }

}
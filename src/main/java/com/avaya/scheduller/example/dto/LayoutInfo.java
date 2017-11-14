package com.avaya.scheduller.example.dto;

import java.io.Serializable;



public class LayoutInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    protected LayoutName layoutName;

    protected String layoutType;

    protected Boolean dynamic;

    protected Boolean noSelfSee;

    protected Integer layoutMax;

    public LayoutInfo() {
        // NOSONAR
    }



    public LayoutName getLayoutName() {
        return this.layoutName;
    }

    public void setLayoutName(LayoutName value) {
        this.layoutName = value;
    }


    public String getLayoutType() {
        return this.layoutType;
    }

    public void setLayoutType(String value) {
        this.layoutType = value;
    }


    public Boolean isDynamic() {
        return this.dynamic;
    }

    public void setDynamic(Boolean value) {
        this.dynamic = value;
    }


    public Boolean isNoSelfSee() {
        return this.noSelfSee;
    }

    public void setNoSelfSee(Boolean value) {
        this.noSelfSee = value;
    }


    public Integer getLayoutMax() {
        return this.layoutMax;
    }

    public void setLayoutMax(Integer value) {
        this.layoutMax = value;
    }

}


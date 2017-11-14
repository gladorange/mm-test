package com.avaya.scheduller.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;



public class ConflictInfo {
    @XmlElement(name = "category")
    protected String category;
    @XmlElement(name = "id")
    protected String id;
    @XmlElement(name = "name")
    protected String name;
    @XmlElement(name = "subject")
    protected List<String> subjects = new ArrayList<String>();

    public ConflictInfo() {
        // constructor for Jackson
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "ConflictInfo [category=" + category + ", id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
    }
}

package com.example.demo.company;

public class companyVO{
    private String id;
    private String name;
    private String condition;
    private String business;
    private String represent;

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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getRepresent() {
        return represent;
    }

    public void setRepresent(String represent) {
        this.represent = represent;
    }

    public companyVO(String id, String name, String condition, String business, String represent) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.business = business;
        this.represent = represent;
    }

    
}
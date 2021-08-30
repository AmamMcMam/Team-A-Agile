package com.kainos.ea.resources;

public class JobResponsibility {

    private int responsibilityId;
    private String responsibility;

    public JobResponsibility(int responsibilityId) {
        this.responsibilityId = responsibilityId;
    }

    public JobResponsibility(int responsibilityId, String responsibility) {
        this.responsibilityId = responsibilityId;
        this.responsibility = responsibility;
    }

    public int getResponsibilityId() { return responsibilityId; }
    public String getResponsibility() { return responsibility; }

}

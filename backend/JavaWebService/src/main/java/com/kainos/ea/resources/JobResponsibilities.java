package com.kainos.ea.resources;

import com.kainos.ea.db.JobResponsibility;

public class JobResponsibilities {

    private int responsibilityID;
    private String responsibility;

    public JobResponsibilities(int responsibilityID, String responsibility) {
        this.responsibilityID = responsibilityID;
        this.responsibility = responsibility;
    }

    public int getResponsibilityID() { return responsibilityID; }
    public String getResponsibility() { return responsibility; }

    //aici tre sa scot din database

}

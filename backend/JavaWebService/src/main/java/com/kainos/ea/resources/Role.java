package com.kainos.ea.resources;

import java.util.Arrays;
import java.util.List;

public class Role {
    private int roleID;
    private String roleName;
    private String roleDesc;
    private String datePosted;
    private String hours;
    private String location;
    private int bandID;
    private int capabilityID;
    private List<String> jobResponsibilities;

    public Role() {}

    public Role(
            int roleID,
            String roleName,
            String roleDesc,
            String datePosted,
            String hours,
            String location,
            int bandID,
            int capabilityID,
            String jobResponsibilities
    ) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.datePosted = datePosted;
        this.hours = hours;
        this.location = location;
        this.bandID = bandID;
        this.capabilityID = capabilityID;
        if (jobResponsibilities != null) {
            this.jobResponsibilities = Arrays.asList(jobResponsibilities.split(","));
        }
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBandID() {
        return bandID;
    }

    public void setBandID(int bandID) {
        this.bandID = bandID;
    }

    public int getCapabilityID() {
        return capabilityID;
    }

    public void setCapabilityID(int capabilityID) {
        this.capabilityID = capabilityID;
    }

    public void setJobResponsibilities(String jobResponsibilities) {
        this.jobResponsibilities = Arrays.asList(jobResponsibilities.split(","));
    }

    public List<String> getJobResponsibilities() {
        return jobResponsibilities;
    }
}

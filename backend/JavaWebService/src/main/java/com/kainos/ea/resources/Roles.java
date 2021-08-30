package com.kainos.ea.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Roles {

    private int roleID;
    private String roleName;
    private String roleDesc;
    private String datePosted;
    private String hours;
    private String location;
    private int bandID;
    private int capabilityID;
    private List<JobResponsibility> jobResponsibilities;


    public Roles(int roleID, String roleName, String roleDesc, String datePosted, String hours, String location, int bandID, int capabilityID, String jobResponsibilitiesIds) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.datePosted = datePosted;
        this.hours = hours;
        this.location = location;
        this.bandID = bandID;
        this.capabilityID = capabilityID;
        if (jobResponsibilitiesIds != null) {
            this.jobResponsibilities = Arrays.asList(jobResponsibilitiesIds.split(",")).stream().map(id -> new JobResponsibility(Integer.parseInt(id))).collect(Collectors.toList());
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

//    public void setJobResponsibilities(List<Integer> jobResponsibilitiesIds) {
//        this.jobResponsibilities = jobResponsibilitiesIds.stream().map(id -> new JobResponsibility(id)).collect(Collectors.toList());
//    }

    public List<JobResponsibility> getJobResponsibilities() {
        return jobResponsibilities;
    }
}

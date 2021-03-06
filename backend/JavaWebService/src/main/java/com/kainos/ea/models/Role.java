package com.kainos.ea.models;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.List;

public class Role {
    private int roleID;
    private String roleName;
    private String roleDesc;
    private LocalDate datePosted;
    private String hours;
    private String location;
    private int bandID;
    private String link;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private List<String> jobResponsibilities;

    public Role() {}

    public Role(
            int roleID,
            String roleName,
            String roleDesc,
            LocalDate datePosted,
            String hours,
            String location,
            int bandID,
            String link,
            String jobResponsibilities
    ) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.datePosted = datePosted;
        this.hours = hours;
        this.location = location;
        this.bandID = bandID;
        this.link = link;
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
        String formattedString = datePosted.format(FORMATTER);
        return formattedString;
    }

    public void setDatePosted(LocalDate datePosted) {
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setJobResponsibilities(String jobResponsibilities) {
        this.jobResponsibilities = Arrays.asList(jobResponsibilities.split(","));
    }

    public List<String> getJobResponsibilities() {
        return jobResponsibilities;
    }
}

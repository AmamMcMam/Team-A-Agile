package com.kainos.ea.resources;

public class JobSpecification {
    private int roleID;
    private String roleName;
    private String roleDesc;
    private String datePosted;
    private String hours;
    private String location;

    public JobSpecification(){

    }

    public JobSpecification(int roleID, String roleName, String roleDesc,
                            String datePosted, String hours, String location) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.datePosted = datePosted;
        this.hours = hours;
        this.location = location;
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

    public void setRoleDesc(String roleDescription) {
        this.roleDesc = roleDescription;
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


}

package com.kainos.ea.models;

public class Capability {
    private int capabilityID;
    private String capability;
    private String capabilityLeadName;
    private String capabilityLeadPhoto;
    private String capabilityLeadMessage;

    public Capability() {}

    public Capability(int capabilityID, String capability, String capabilityLeadName, String capabilityLeadPhoto, String capabilityLeadMessage) {
        this.capabilityID = capabilityID;
        this.capability = capability;
        this.capabilityLeadName = capabilityLeadName;
        this.capabilityLeadPhoto = capabilityLeadPhoto;
        this.capabilityLeadMessage = capabilityLeadMessage;
    }

    public int getCapabilityID() {
        return capabilityID;
    }

    public void setCapabilityID(int capabilityID) {
        this.capabilityID = capabilityID;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public String getCapabilityLeadName() {
        return capabilityLeadName;
    }

    public void setCapabilityLeadName(String capabilityLeadName) {
        this.capabilityLeadName = capabilityLeadName;
    }

    public String getCapabilityLeadPhoto() {
        return capabilityLeadPhoto;
    }

    public void setCapabilityLeadPhoto(String capabilityLeadPhoto) {
        this.capabilityLeadPhoto = capabilityLeadPhoto;
    }

    public String getCapabilityLeadMessage() {
        return capabilityLeadMessage;
    }

    public void setCapabilityLeadMessage(String capabilityLeadMessage) {
        this.capabilityLeadMessage = capabilityLeadMessage;
    }
}

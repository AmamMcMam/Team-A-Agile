package com.kainos.ea.models;

public class Capability {
    private int capabilityID;
    private String capability;

    public Capability() {}

    public Capability(int capabilityID, String capability) {
        this.capabilityID = capabilityID;
        this.capability = capability;
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
}

package com.kainos.ea.models;

public class Band{
    private int bandID;
    private String bandName;

    public Band(){}

    public Band(int bandID, String bandName){
        this.bandID = bandID;
        this.bandName = bandName;
    }

    public int getBandID() {
        return bandID;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}

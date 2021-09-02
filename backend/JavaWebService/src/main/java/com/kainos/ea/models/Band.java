package com.kainos.ea.models;

public class Band{
    private int bandID;
    private String bandName;
    private String bandExpectations;

    public Band(){}

    public Band(int bandID, String bandName, String bandExpectations){
        this.bandID = bandID;
        this.bandName = bandName;
        this.bandExpectations = bandExpectations;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandExpectations() {
        return bandExpectations;
    }

}

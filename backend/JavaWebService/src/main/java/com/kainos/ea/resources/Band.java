package com.kainos.ea.resources;

public class Band{
    private int bandID;
    private String bandName;
    private String bandExpectations;

    public Band(int bandID, String bandName, String bandExpectations){
        this.bandID = bandID;
        this.bandName = bandName;
        this.bandExpectations = bandExpectations;
    }

    public String getBandName() {
        System.out.println(bandName);
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandExpectations() {
        return bandExpectations;
    }

}

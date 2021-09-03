package com.kainos.ea.resources;

public class CompetencyElement {
    private int competencyElementID;
    private String elementName;
    private String elementDescription;
    private int competencyID;
    private int compBandID;
    private String competencyName;

    //for getting the competencies per band
    public CompetencyElement(int competencyElementID, int competencyID, String elementName,
                             int compBandID, String elementDescription, String competencyName){
        this.competencyElementID = competencyElementID;
        this.competencyID = competencyID;
        this.elementName = elementName;
        this.compBandID = compBandID;
        this.elementDescription = elementDescription;
        this.competencyName = competencyName;
    }

    //for getting the competency names
    public CompetencyElement(int competencyID, String competencyName){
        this.competencyID = competencyID;
        this.competencyName = competencyName;
    }

    public CompetencyElement(){}

    public String getCompetencyName() {
        return competencyName;
    }
    public int getCompetencyElementID() {
        return competencyElementID;
    }

    public String getElementDescription() {
        return elementDescription;
    }

    public String getElementName() {
        return elementName;
    }

    public int getCompetencyID() {
        return competencyID;
    }

    public int getCompBandID() {
        return compBandID;
    }

    public void setCompetencyElementID(int competencyElementID) {
        this.competencyElementID = competencyElementID;
    }

    public void setCompetencyID(int competencyID) {
        this.competencyID = competencyID;
    }

    public void setCompBandID(int compBandID) {
        this.compBandID = compBandID;
    }

    public void setCompetencyName(String competencyName) {
        this.competencyName = competencyName;
    }

    public void setElementDescription(String elementDescription) {
        this.elementDescription = elementDescription;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
}

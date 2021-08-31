package com.kainos.ea.resources;

public class CompetencyElement {
    private int competencyElementID;
    private String elementName;
    private String elementDescription;
    private int competencyID;
    private int compBandID;
    public CompetencyElement(int competencyElementID, int competencyID, String elementName,
                             int compBandID, String elementDescription){
        this.competencyElementID = competencyElementID;
        this.competencyID = competencyID;
        this.elementName = elementName;
        this.compBandID = compBandID;
        this.elementDescription = elementDescription;
    }

    public CompetencyElement(int compBandID, int competencyID, String elementName, String elementDescription){
        this.compBandID = compBandID;
        this.competencyID = competencyID;
        this.elementName = elementName;
        this.elementDescription = elementDescription;
    }
    public CompetencyElement(){}

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
}

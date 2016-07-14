package com.company;

import java.util.ArrayList;

public class Symptom {
    private int symptomID;
    private String symptomName;
    private String symptomDescription;

    public int getSymptomID() {
        return symptomID;
    }

    public void setSymptomID(int symptomID) {
        this.symptomID = symptomID;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public String getSymptomDescription() {
        return symptomDescription;
    }

    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription;
    }

    public ArrayList getSymptomNameSynonyms() {
        return symptomNameSynonyms;
    }

    public void setSymptomNameSynonyms(ArrayList symptomNameSynonyms) {
        this.symptomNameSynonyms = symptomNameSynonyms;
    }

    public ArrayList<Integer> getSymptomConnections() {
        return symptomConnections;
    }

    public void setSymptomConnections(ArrayList<Integer> symptomConnections) {
        this.symptomConnections = symptomConnections;
    }

    private ArrayList symptomNameSynonyms;
    private ArrayList<Integer> symptomConnections;


}

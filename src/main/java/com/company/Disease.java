package com.company;

import java.util.ArrayList;

public class Disease {
    private static String diseaseID;
    private static String diseaseName;
    private static String diseaseNameSynonyms;
    private static String diseaseConnections;
    private static String specialistType;

    public static String getDiseaseID() {
        return diseaseID;
    }

    public static void setDiseaseID(String diseaseID) {
        Disease.diseaseID = diseaseID;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }


    public static String getDiseaseNameSynonyms() {
        return diseaseNameSynonyms;
    }

    public static void setDiseaseNameSynonyms(String diseaseNameSynonyms) {
        Disease.diseaseNameSynonyms = diseaseNameSynonyms;
    }

    public static String getDiseaseConnections() {
        return diseaseConnections;
    }

    public static void setDiseaseConnections(String diseaseConnections) {
        Disease.diseaseConnections = diseaseConnections;
    }

    public String getSpecialistType() {
        return specialistType;
    }

    public void setSpecialistType(String specialistType) {
        this.specialistType = specialistType;
    }
}

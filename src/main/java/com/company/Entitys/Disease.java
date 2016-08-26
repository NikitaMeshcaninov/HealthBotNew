package com.company.Entitys;

import javax.persistence.*;
import java.util.ArrayList;


public class Disease {
    private long diseaseID;
    private String diseaseName;
    private String diseaseNameSynonyms;
    private String specialistType;

    public Disease(String diseaseName, String diseaseNameSynonyms, String specialistType) {
        this.diseaseName = diseaseName;
        this.diseaseNameSynonyms = diseaseNameSynonyms;
        this.specialistType = specialistType;
    }

    public Disease() {
    }

    public long getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(long diseaseID) {
        this.diseaseID = diseaseID;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseNameSynonyms() {
        return diseaseNameSynonyms;
    }

    public void setDiseaseNameSynonyms(String diseaseNameSynonyms) {
        this.diseaseNameSynonyms = diseaseNameSynonyms;
    }

    public String getSpecialistType() {
        return specialistType;
    }

    public void setSpecialistType(String specialistType) {
        this.specialistType = specialistType;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "diseaseID=" + diseaseID +
                ", diseaseName='" + diseaseName + '\'' +
                ", diseaseNameSynonyms='" + diseaseNameSynonyms + '\'' +
                ", specialistType='" + specialistType + '\'' +
                '}';
    }
}

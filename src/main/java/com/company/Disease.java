package com.company;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "disease")
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "diseaseID")
    private long diseaseID;
    @Column(name = "diseaseName")
    private String diseaseName;
    @Column(name = "diseaseNameSynonyms")
    private String diseaseNameSynonyms;
    @Column(name = "specialistType")
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
}

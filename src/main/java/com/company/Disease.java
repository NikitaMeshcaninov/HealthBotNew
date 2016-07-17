package com.company;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Table(name="disease")
public class Disease {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="diseaseID")
    private static String diseaseID;
    @Column(name="diseaseName")
    private static String diseaseName;
    @Column(name="diseaseNameSynonyms")
    private static String diseaseNameSynonyms;
    @Column(name="specialistType")
    private static String specialistType;


    public static String getDiseaseID() {
        return diseaseID;
    }

    public static void setDiseaseID(String diseaseID) {
        Disease.diseaseID = diseaseID;
    }

    public static String getDiseaseName() {
        return diseaseName;
    }

    public static void setDiseaseName(String diseaseName) {
        Disease.diseaseName = diseaseName;
    }

    public static String getDiseaseNameSynonyms() {
        return diseaseNameSynonyms;
    }

    public static void setDiseaseNameSynonyms(String diseaseNameSynonyms) {
        Disease.diseaseNameSynonyms = diseaseNameSynonyms;
    }

    public static String getSpecialistType() {
        return specialistType;
    }

    public static void setSpecialistType(String specialistType) {
        Disease.specialistType = specialistType;
    }
}

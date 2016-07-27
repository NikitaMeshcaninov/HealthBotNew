package com.company.Engine;


import com.company.Entitys.Disease;
import com.company.Entitys.Symptom;
import com.company.Listeners.LoginDiseaseActionListener;
import com.company.Listeners.LoginSymptomActionListener;
import com.company.utils.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

public class HealthEngine {

    public void addDisease() throws SQLException {
        HibernateUtil.init();
        Disease disease = new Disease();
        disease.setDiseaseName(LoginDiseaseActionListener.win.getDiseaseTextField().getText());
        disease.setDiseaseNameSynonyms(LoginDiseaseActionListener.win.getDiseaseNameSynonymsfield().getText());
        disease.setSpecialistType(LoginDiseaseActionListener.win.getDiseaseSpecialistTypeField().getText());
        DiseaseDAOimpl diseaseDAOimpl = new DiseaseDAOimpl();
        diseaseDAOimpl.addDisease(disease);
        String id  = Long.toString(disease.getDiseaseID());
        LoginDiseaseActionListener.win.getDeseaseIDtextField().setText(id);

    }

    public void printId() { //мотод который возвращает ID присвоенный новой болезни (не пашет)
        HibernateUtil.init();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.createQuery("SELECT * from disease WHERE diseaseName =  " + LoginDiseaseActionListener.win.getDiseaseTextField().getText());
        // Disease disease = (Disease) session.load(Disease.class).list;

        session.getTransaction().commit();

        LoginDiseaseActionListener.win.getDeseaseIDtextField().setText("сюда звпилить ID");
    }

    public void delDisease() {
        HibernateUtil.init();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.createQuery("DELETE FROM Disease where diseaseID = " + LoginDiseaseActionListener.win.getDeseaseIDtextField().getText()).executeUpdate();
        session.getTransaction().commit();
    }

    public void addSymptom() {
        HibernateUtil.init();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Symptom symptom = new Symptom();
        symptom.setSymptomName(LoginSymptomActionListener.winSymptom.getSymptomNameTextField().getText());
        symptom.setSymptomSynonyms(LoginSymptomActionListener.winSymptom.getSymptomNameSynonymsfield().getText());
        session.save(symptom);
        session.getTransaction().commit();
        //printId();
    }

    public void delSymptom() {
        HibernateUtil.init();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.createQuery("DELETE FROM Symptom where symptomId = " + LoginSymptomActionListener.winSymptom.getSymptomIdTextField().getText()).executeUpdate();
        session.getTransaction().commit();
    }

}


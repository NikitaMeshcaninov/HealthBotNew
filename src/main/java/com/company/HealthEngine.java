package com.company;


import com.company.Listeners.LoginAsDoctorActionListener;
import com.company.utils.HibernateUtil;
import org.hibernate.Session;

public class HealthEngine {

    public void addProfession() {
        HibernateUtil.init();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Disease disease = new Disease();
        disease.setDiseaseName(LoginAsDoctorActionListener.win.getDiseaseTextField().getText());
        disease.setDiseaseNameSynonyms(LoginAsDoctorActionListener.win.getDiseaseNameSynonymsfield().getText());
        disease.setSpecialistType(LoginAsDoctorActionListener.win.getDiseaseSpecialistTypeField().getText());
        session.save(disease);
        session.getTransaction().commit();
    }


}


package com.company.Engine;

import com.company.Entitys.Disease;
import com.company.Listeners.LoginDiseaseActionListener;
import com.company.utils.HibernateUtil;
import com.sun.deploy.panel.JSmartTextArea;
import org.hibernate.Session;
import org.hibernate.mapping.List;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Nikita on 27.07.2016.
 */
public class DiseaseDAOimpl implements DiseaseDAO {
    @Override
    public void addDisease(Disease disease) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(disease);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void delDisease(Disease disease) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(disease);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void getDiseaseById(Long id) throws SQLException {
        HibernateUtil.init();
        Session session = null;
        Disease disease = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            disease = (Disease) session.load(Disease.class, id);
            LoginDiseaseActionListener.win.getDiseaseTextField().setText(disease.getDiseaseName());
            LoginDiseaseActionListener.win.getDiseaseNameSynonymsfield().setText(disease.getDiseaseNameSynonyms());
            LoginDiseaseActionListener.win.getDiseaseSpecialistTypeField().setText(disease.getSpecialistType());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public List getAllDisease() throws SQLException {
        Session session = null;
        java.util.List<Disease> diseases = new ArrayList<Disease>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            diseases = session.createCriteria(Disease.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return (List) diseases;
    }

    @Override
    public void upDateDisease(Disease disease) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(disease);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }
}

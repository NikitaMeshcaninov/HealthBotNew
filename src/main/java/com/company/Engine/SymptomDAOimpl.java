package com.company.Engine;

import com.company.Entitys.Symptom;
import com.company.utils.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import javax.swing.*;
import java.beans.Expression;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Nikita on 27.07.2016.
 */
public class SymptomDAOimpl implements SymptomDAO {
    @Override
    public void addSymptom(Symptom symptom) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(symptom);
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
    public void delSymptom(Symptom symptom) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(symptom);
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
    public Symptom getSymptomById(Long id) throws SQLException {
        Session session = null;
        Symptom symptom = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            symptom = (Symptom) session.load(Symptom.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return symptom;
    }

    @Override
    public List getAllSymptoms() throws SQLException {
        Session session = null;
        List<Symptom> symptoms = new ArrayList<Symptom>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            symptoms = session.createCriteria(Symptom.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return symptoms;
    }

    @Override
    public void upDateSymptom(Symptom symptom) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(symptom);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Symptom getSymptomByName(String name) throws SQLException {
        Session session = null;
        Symptom t = null;

        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            List<Symptom> symptoms = session.createQuery("FROM Symptom WHERE symptomName ='" + name + "'").list();
            for (Symptom symptom : symptoms) Hibernate.initialize(symptom.getSymptomName());
            t = symptoms.get(0);
            session.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return t;
    }
}
   /* public List<Profession> findProfession() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Profession> result = session.createQuery("from Profession order by professionName").list();
        // Насильная инициализация списка. Не очень хорошая практика так делать
        for (Profession a : result) {
            Hibernate.initialize(a.getSubjectList());
        }
        session.getTransaction().commit();
        return result;
    }*/
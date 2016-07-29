package com.company.Engine;

import com.company.Entitys.Conection;
import com.company.utils.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nikita on 29.07.2016.
 */
public class ConectionDAOimpl implements ConectionDAO {
    @Override
    public void addConection(Conection conection) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(conection);
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
    public void delConection(Conection conection) throws SQLException {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(conection);
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

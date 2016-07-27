package com.company.Listeners;

import com.company.Engine.DiseaseDAOimpl;
import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Nikita on 27.07.2016.
 */
public class GetDiseaseByIdActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        DiseaseDAOimpl t = new DiseaseDAOimpl();
        Long id  = new Long(LoginDiseaseActionListener.win.getDeseaseIDtextField().getText());
        try {
            t.getDiseaseById(id);
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
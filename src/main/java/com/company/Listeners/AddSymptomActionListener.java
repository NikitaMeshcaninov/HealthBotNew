package com.company.Listeners;

import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Nikita on 26.07.2016.
 */
public class AddSymptomActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        HealthEngine someInstance = new HealthEngine();
        try {
            someInstance.addSymptom();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}



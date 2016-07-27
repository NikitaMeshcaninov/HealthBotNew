package com.company.Listeners;

import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class AddDiseaseActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        HealthEngine someInstance = new HealthEngine();
        try {
            someInstance.addDisease();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}



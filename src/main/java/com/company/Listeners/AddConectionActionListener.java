package com.company.Listeners;

import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Nikita on 29.07.2016.
 */
public class AddConectionActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        HealthEngine r1 = new HealthEngine();
        try {
            r1.addConection();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

    }
}



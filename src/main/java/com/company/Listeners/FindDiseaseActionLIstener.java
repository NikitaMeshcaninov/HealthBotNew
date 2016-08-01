package com.company.Listeners;

import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Nikita on 01.08.2016.
 */
public class FindDiseaseActionLIstener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        HealthEngine r1 = new HealthEngine();

            r1.findUserDisease(LoginAsUserActionListener.winUser.getUserSymptomTextField().getText());


    }
}
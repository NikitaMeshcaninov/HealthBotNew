package com.company.Listeners;

import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Nikita on 01.08.2016.
 */
public class FindDiseaseActionLIstener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        HealthEngine r1 = new HealthEngine();
        ArrayList userSymptoms = new ArrayList();


        if (!LoginAsUserActionListener.winUser.getUserSymptomTextField1().getText().equals("")) {
            userSymptoms.add("'" + LoginAsUserActionListener.winUser.getUserSymptomTextField1().getText() + "'");
        }
        if (!LoginAsUserActionListener.winUser.getUserSymptomTextField2().getText().equals("")) {
            userSymptoms.add("'" + LoginAsUserActionListener.winUser.getUserSymptomTextField2().getText() + "'");
        }
        if (!LoginAsUserActionListener.winUser.getUserSymptomTextField3().getText().equals("")) {
            userSymptoms.add("'" + LoginAsUserActionListener.winUser.getUserSymptomTextField3().getText() + "'");
        }
        if (!LoginAsUserActionListener.winUser.getUserSymptomTextField4().getText().equals("")) {
            userSymptoms.add("'" + LoginAsUserActionListener.winUser.getUserSymptomTextField4().getText() + "'");
        }
        if (!LoginAsUserActionListener.winUser.getUserSymptomTextField5().getText().equals("")) {
            userSymptoms.add("'" + LoginAsUserActionListener.winUser.getUserSymptomTextField5().getText() + "'");
        }
        System.out.println(userSymptoms);
        r1.findUserDisease(userSymptoms);


    }
}
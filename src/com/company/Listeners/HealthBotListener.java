package com.company.Listeners;

import com.company.Disease;
import com.company.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthBotListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(Main.win.getDiseaseTextField().getText() + "" + Main.win.getDiseaseNameSynonymsfield().getText() +" " + Main.win.getDeseaseIDtextField() + " " + Main.win.getDiseaseConnectionsField());

    }
}



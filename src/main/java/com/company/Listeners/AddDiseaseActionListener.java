package com.company.Listeners;

import com.company.Disease;
import com.company.Main;
import com.company.UI.AddDiseaseUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDiseaseActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(LoginAsDoctorActionListener.win.getDiseaseTextField().getText() + " " + LoginAsDoctorActionListener.win.getDiseaseNameSynonymsfield().getText() + " "
                + LoginAsDoctorActionListener.win.getDeseaseIDtextField().getText() + " " + LoginAsDoctorActionListener.win.getDiseaseConnectionsField().getText());

    }
}



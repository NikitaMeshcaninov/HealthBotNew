package com.company.Listeners;

import com.company.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDiseaseActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        HealthEngine someInstance = new HealthEngine();
        someInstance.addSymptom();
    }
}



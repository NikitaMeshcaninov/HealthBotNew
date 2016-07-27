package com.company.Listeners;

import com.company.Engine.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelDiseaseActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        HealthEngine someInstance = new HealthEngine();
        someInstance.delDisease();
    }
}
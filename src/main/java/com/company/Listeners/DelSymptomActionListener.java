package com.company.Listeners;

import com.company.HealthEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikita on 26.07.2016.
 */
public class DelSymptomActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        HealthEngine someInstance = new HealthEngine();
        someInstance.delSymptom();
    }
}



package com.company.Listeners;

import com.company.Disease;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiseaseSynonymsActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ev) {
        Disease firstDidease = new Disease();
        firstDidease.setDiseaseNameSynonyms(ev.getActionCommand());
        System.out.println(firstDidease.getDiseaseName() + "  " + firstDidease.getDiseaseID()+
                "  " + firstDidease.getDiseaseConnections()+ "  " + firstDidease.getDiseaseNameSynonyms());
    }
}
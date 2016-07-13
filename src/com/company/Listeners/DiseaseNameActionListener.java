package com.company.Listeners;

import com.company.Disease;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiseaseNameActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Disease firstDidease = new Disease();
        firstDidease.setDiseaseName(e.getActionCommand());
        System.out.println(firstDidease.getDiseaseName() + "  " + firstDidease.getDiseaseID()+
                "  " + firstDidease.getDiseaseConnections()+ "  " + firstDidease.getDiseaseNameSynonyms());
    }
}

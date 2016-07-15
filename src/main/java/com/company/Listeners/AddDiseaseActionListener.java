package com.company.Listeners;

import com.company.Disease;
import com.company.Main;
import com.company.UI.AddDiseaseUI;
import com.company.utils.DBWorker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDiseaseActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        DBWorker adder = new DBWorker();
        adder.addDiseaseToDB();
    }
}



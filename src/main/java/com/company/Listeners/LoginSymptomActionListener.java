package com.company.Listeners;

import com.company.Main;
import com.company.UI.DiseaseUI;
import com.company.UI.SymptomUi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikita on 26.07.2016.
 */
public class LoginSymptomActionListener implements ActionListener {
    public static SymptomUi winSymptom;


    @Override
    public void actionPerformed(ActionEvent e) {
        if (Main.loginWindow.getPasswordTextField().getText().equals("1111")){
            winSymptom = new SymptomUi();
            winSymptom.addSymptomWindow();
            Main.loginWindow.getFrame().setVisible(false);
        }
    }
}

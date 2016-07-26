package com.company.Listeners;

import com.company.Main;
import com.company.UI.DiseaseUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikita on 14.07.2016.
 */
public class LoginAsDoctorActionListener implements ActionListener {
    public static DiseaseUI win;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Main.loginWindow.getPasswordTextField().getText());
        if (Main.loginWindow.getPasswordTextField().getText().equals("1111")){
        win = new DiseaseUI();
        win.healthBotWindow();
        Main.loginWindow.getFrame().setVisible(false);
        }
    }
}

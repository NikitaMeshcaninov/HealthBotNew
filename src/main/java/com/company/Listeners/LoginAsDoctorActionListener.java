package com.company.Listeners;

import com.company.Main;
import com.company.UI.AddDiseaseUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikita on 14.07.2016.
 */
public class LoginAsDoctorActionListener implements ActionListener {
    public static AddDiseaseUI win;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Main.loginWindow.getPasswordTextField().getText());
        win = new AddDiseaseUI();
        win.healthBotWindow();
        Main.loginWindow.setVisible(false);
        Main.loginWindow.dispose();
    }
}

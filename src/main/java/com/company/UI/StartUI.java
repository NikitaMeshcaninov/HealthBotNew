package com.company.UI;


import com.company.Listeners.LoginAsDoctorActionListener;
import com.company.Listeners.LoginAsUserActionListener;
import com.company.Listeners.LoginSymptomActionListener;

import javax.swing.*;
import java.awt.*;

public class StartUI extends JFrame {

    private JLabel loginTextField = new JLabel("Pls select type of UI. If you docto and whant to add new info to DB, set you password and login as doctor");
    private JTextField passwordTextField = new JTextField(10);
    private JButton loginAsUserButton = new JButton("Login as user");
    private JButton loginAsDoctorButtonDisease = new JButton("Login as doctor Disease");
    private JButton loginAsDoctorButtonSymptom = new JButton("Login as doctor Symptom");

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    private JFrame frame = new JFrame("Login");


    public JTextField getPasswordTextField() {
        return passwordTextField;
    }

    public void healthBotLoginWindow() {

        JPanel healthBotLoginWindowPanel = new JPanel();

        FlowLayout fl = new FlowLayout();
        healthBotLoginWindowPanel.setLayout(fl);

        healthBotLoginWindowPanel.add(loginTextField);
        healthBotLoginWindowPanel.add(passwordTextField);
        healthBotLoginWindowPanel.add(loginAsDoctorButtonDisease);
        healthBotLoginWindowPanel.add(loginAsDoctorButtonSymptom);
        healthBotLoginWindowPanel.add(loginAsUserButton);



        frame.setContentPane(healthBotLoginWindowPanel);

        frame.setSize(600, 200);
        frame.setVisible(true);

        LoginAsUserActionListener pushButtonLoginAsUserEvent = new LoginAsUserActionListener();
        loginAsUserButton.addActionListener(pushButtonLoginAsUserEvent);

        LoginAsDoctorActionListener pushButtonLoginAsDoctorEvent02 = new LoginAsDoctorActionListener();
        loginAsDoctorButtonDisease.addActionListener(pushButtonLoginAsDoctorEvent02);

        LoginSymptomActionListener pushButtonLoginAsDoctorEvent01 = new LoginSymptomActionListener();
        loginAsDoctorButtonSymptom.addActionListener(pushButtonLoginAsDoctorEvent01);

    }
}

package com.company.UI;


import com.company.Listeners.AddDiseaseActionListener;
import com.company.Listeners.LoginAsDoctorActionListener;
import com.company.Listeners.LoginAsUserActionListener;

import javax.swing.*;
import java.awt.*;

public class StartUI extends JFrame {

    private JLabel loginTextField = new JLabel("Pls select type of UI. If you docto and whant to add new info to DB, set you password and login as doctor");
    private JTextField passwordTextField = new JTextField(10);
    private JButton loginAsUserButton = new JButton("Login as user");
    private JButton loginAsDoctorButton = new JButton("Login as doctor");


    public JTextField getPasswordTextField() {
        return passwordTextField;
    }

    public void healthBotLoginWindow() {

        JPanel healthBotLoginWindowPanel = new JPanel();

        FlowLayout fl = new FlowLayout();
        healthBotLoginWindowPanel.setLayout(fl);

        healthBotLoginWindowPanel.add(loginTextField);
        healthBotLoginWindowPanel.add(passwordTextField);
        healthBotLoginWindowPanel.add(loginAsDoctorButton);
        healthBotLoginWindowPanel.add(loginAsUserButton);

        JFrame frame = new JFrame("Login");

        frame.setContentPane(healthBotLoginWindowPanel);

        frame.setSize(600, 200);
        frame.setVisible(true);

        LoginAsUserActionListener pushButtonLoginAsUserEvent = new LoginAsUserActionListener();
        loginAsUserButton.addActionListener(pushButtonLoginAsUserEvent);

        LoginAsDoctorActionListener pushButtonLoginAsDoctorEvent = new LoginAsDoctorActionListener();
        loginAsDoctorButton.addActionListener(pushButtonLoginAsDoctorEvent);

    }
}

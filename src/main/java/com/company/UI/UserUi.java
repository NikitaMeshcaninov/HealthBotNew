package com.company.UI;

import com.company.Listeners.LoginAsDoctorActionListener;
import com.company.Listeners.LoginAsUserActionListener;
import com.company.Listeners.LoginSymptomActionListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikita on 27.07.2016.
 */
public class UserUi extends JFrame {

    private JLabel loginTextField = new JLabel("TEST");
    private JTextField passwordTextField = new JTextField(10);
    private JButton loginAsUserButton = new JButton("TEST BUTTON 0");
    private JButton loginAsDoctorButtonDisease = new JButton("TEST BUTTON 1 ");
    private JButton loginAsDoctorButtonSymptom = new JButton("TEST BUTTON 2 ");

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

    public void userWindow() {

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

package com.company.UI;

import com.company.Listeners.LoginDiseaseActionListener;
import com.company.Listeners.LoginAsUserActionListener;
import com.company.Listeners.LoginSymptomActionListener;
import com.sun.deploy.panel.JSmartTextArea;

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
    private JTextArea textArea = new JSmartTextArea("Some text");

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

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

        JPanel panel = new JPanel();

        FlowLayout fl = new FlowLayout();
        panel.setLayout(fl);

        panel.add(loginTextField);
        panel.add(passwordTextField);
        panel.add(loginAsDoctorButtonDisease);
        panel.add(loginAsDoctorButtonSymptom);
        panel.add(loginAsUserButton);
        panel.add(textArea);



        frame.setContentPane(panel);

        frame.setSize(600, 200);
        frame.setVisible(true);

        LoginAsUserActionListener pushButtonLoginAsUserEvent = new LoginAsUserActionListener();
        loginAsUserButton.addActionListener(pushButtonLoginAsUserEvent);

        LoginDiseaseActionListener pushButtonLoginAsDoctorEvent02 = new LoginDiseaseActionListener();
        loginAsDoctorButtonDisease.addActionListener(pushButtonLoginAsDoctorEvent02);

        LoginSymptomActionListener pushButtonLoginAsDoctorEvent01 = new LoginSymptomActionListener();
        loginAsDoctorButtonSymptom.addActionListener(pushButtonLoginAsDoctorEvent01);

    }
}

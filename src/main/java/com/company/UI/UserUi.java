package com.company.UI;

import com.company.Listeners.FindDiseaseActionLIstener;
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

    private JLabel userSymptom = new JLabel("Введите симптом и нажмите клавишу \"Найти болезнь\"");
    private JTextField userSymptomTextField = new JTextField(10);
    private JButton findDiseaseButton = new JButton("Найти болезнь");
    private JLabel workDiscriptonText = new JLabel("Вероятно вы страдаете от");
    private JTextField userDisease = new JTextField(10);
    private JLabel userDiseaseSpecialist = new JLabel("Вам необходимо обратиться к ");
    private JTextField userSpecialist = new JTextField(10);


    public JLabel getUserSymptom() {
        return userSymptom;
    }

    public void setUserSymptom(JLabel userSymptom) {
        this.userSymptom = userSymptom;
    }

    public JTextField getUserSymptomTextField() {
        return userSymptomTextField;
    }

    public void setUserSymptomTextField(JTextField userSymptomTextField) {
        this.userSymptomTextField = userSymptomTextField;
    }

    public JButton getFindDiseaseButton() {
        return findDiseaseButton;
    }

    public void setFindDiseaseButton(JButton findDiseaseButton) {
        this.findDiseaseButton = findDiseaseButton;
    }

    public JLabel getWorkDiscriptonText() {
        return workDiscriptonText;
    }

    public void setWorkDiscriptonText(JLabel workDiscriptonText) {
        this.workDiscriptonText = workDiscriptonText;
    }

    public JTextField getUserDisease() {
        return userDisease;
    }

    public void setUserDisease(JTextField userDisease) {
        this.userDisease = userDisease;
    }

    public JLabel getUserDiseaseSpecialist() {
        return userDiseaseSpecialist;
    }

    public void setUserDiseaseSpecialist(JLabel userDiseaseSpecialist) {
        this.userDiseaseSpecialist = userDiseaseSpecialist;
    }

    public JTextField getUserSpecialist() {
        return userSpecialist;
    }

    public void setUserSpecialist(JTextField userSpecialist) {
        this.userSpecialist = userSpecialist;
    }

    public void userWindow() {

        JPanel panel = new JPanel();

        FlowLayout fl = new FlowLayout();
        panel.setLayout(fl);

        panel.add(userSymptom);
        panel.add(userSymptomTextField);
        panel.add(findDiseaseButton);
        panel.add(workDiscriptonText);
        panel.add(userDisease);
        panel.add(userDiseaseSpecialist);
        panel.add(userSpecialist);

        JFrame frame = new JFrame();

        frame.setContentPane(panel);

        frame.setSize(600, 200);
        frame.setVisible(true);

        FindDiseaseActionLIstener pushButtonEvent= new FindDiseaseActionLIstener();
        findDiseaseButton.addActionListener(pushButtonEvent);
    }
}


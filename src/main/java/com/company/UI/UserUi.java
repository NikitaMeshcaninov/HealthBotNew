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

    private JLabel userSymptom = new JLabel("Введите симптомs и нажмите клавишу \"Найти болезнь\"");
    private JTextField userSymptomTextField1 = new JTextField(10);
    private JTextField userSymptomTextField2 = new JTextField(10);
    private JTextField userSymptomTextField3 = new JTextField(10);
    private JTextField userSymptomTextField4 = new JTextField(10);
    private JTextField userSymptomTextField5 = new JTextField(10);
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

    public JTextField getUserSymptomTextField1() {
        return userSymptomTextField1;
    }

    public void setUserSymptomTextField1(JTextField userSymptomTextField1) {
        this.userSymptomTextField1 = userSymptomTextField1;
    }

    public JTextField getUserSymptomTextField2() {
        return userSymptomTextField2;
    }

    public void setUserSymptomTextField2(JTextField userSymptomTextField2) {
        this.userSymptomTextField2 = userSymptomTextField2;
    }

    public JTextField getUserSymptomTextField3() {
        return userSymptomTextField3;
    }

    public void setUserSymptomTextField3(JTextField userSymptomTextField3) {
        this.userSymptomTextField3 = userSymptomTextField3;
    }

    public JTextField getUserSymptomTextField4() {
        return userSymptomTextField4;
    }

    public void setUserSymptomTextField4(JTextField userSymptomTextField4) {
        this.userSymptomTextField4 = userSymptomTextField4;
    }

    public JTextField getUserSymptomTextField5() {
        return userSymptomTextField5;
    }

    public void setUserSymptomTextField5(JTextField userSymptomTextField5) {
        this.userSymptomTextField5 = userSymptomTextField5;
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
        panel.add(userSymptomTextField1);
        panel.add(userSymptomTextField2);
        panel.add(userSymptomTextField3);
        panel.add(userSymptomTextField4);
        panel.add(userSymptomTextField5);
        panel.add(findDiseaseButton);
        panel.add(workDiscriptonText);
        panel.add(userDisease);
        panel.add(userDiseaseSpecialist);
        panel.add(userSpecialist);

        JFrame frame = new JFrame();

        frame.setContentPane(panel);

        frame.setSize(600, 200);
        frame.setVisible(true);

        FindDiseaseActionLIstener pushButtonEvent = new FindDiseaseActionLIstener();
        findDiseaseButton.addActionListener(pushButtonEvent);
    }
}


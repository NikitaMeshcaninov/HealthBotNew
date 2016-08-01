package com.company.UI;

import com.company.Listeners.AddDiseaseActionListener;
import com.company.Listeners.AddSymptomActionListener;
import com.company.Listeners.DelDiseaseActionListener;
import com.company.Listeners.DelSymptomActionListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikita on 26.07.2016.
 */
public class SymptomUi extends JFrame {

    private JLabel symptom = new JLabel("Symptom :");
    private JTextField symptomNameTextField = new JTextField(10);

    private JLabel symptomID = new JLabel("SymptomId :");
    private JTextField symptomIdTextField = new JTextField(10);

    private JLabel symptomNameSynonyms = new JLabel("symptomNameSynonyms :");
    private JTextField symptomNameSynonymsfield = new JTextField(10);

    public JTextField getSymptomNameTextField() {
        return symptomNameTextField;
    }

    public void setSymptomNameTextField(JTextField symptomNameTextField) {
        this.symptomNameTextField = symptomNameTextField;
    }

    public JTextField getSymptomIdTextField() {
        return symptomIdTextField;
    }

    public void setSymptomIdTextField(JTextField symptomIdTextField) {
        this.symptomIdTextField = symptomIdTextField;
    }

    public JTextField getSymptomNameSynonymsfield() {
        return symptomNameSynonymsfield;
    }

    public void setSymptomNameSynonymsfield(JTextField symptomNameSynonymsfield) {
        this.symptomNameSynonymsfield = symptomNameSynonymsfield;
    }

    private JButton addSymptomButton = new JButton("Add Symptom");
    private JButton delSymptomButton = new JButton("Del Symptom");


    public void addSymptomWindow() {

        JPanel healthBotWindowPanel = new JPanel();

        FlowLayout fl = new FlowLayout();
        healthBotWindowPanel.setLayout(fl);

        healthBotWindowPanel.add(symptom);
        healthBotWindowPanel.add(symptomNameTextField);
        healthBotWindowPanel.add(symptomNameSynonyms);
        healthBotWindowPanel.add(symptomNameSynonymsfield);
        healthBotWindowPanel.add(symptomID);
        healthBotWindowPanel.add(symptomIdTextField);
        healthBotWindowPanel.add(addSymptomButton);
        healthBotWindowPanel.add(delSymptomButton);


        JFrame frame = new JFrame("Symptom");

        frame.setContentPane(healthBotWindowPanel);

        frame.setSize(400, 400);
        frame.setVisible(true);

        AddSymptomActionListener pushButtonEvent01 = new AddSymptomActionListener();
        addSymptomButton.addActionListener(pushButtonEvent01);

        DelSymptomActionListener pushButtonEvent02 = new DelSymptomActionListener();
        delSymptomButton.addActionListener(pushButtonEvent02);

    }
}

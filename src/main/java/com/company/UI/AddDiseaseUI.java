package com.company.UI;

import com.company.Listeners.*;
import javax.swing.*;
import java.awt.*;


public class AddDiseaseUI extends JFrame {

    private JLabel disease = new JLabel("Disease :");
    private JTextField diseaseTextField = new JTextField(10);
    private JLabel deseaseID = new JLabel("deseaseID :");
    private JTextField deseaseIDtextField = new JTextField(10);
    private JLabel diseaseNameSynonyms = new JLabel("diseaseNameSynonyms :");
    private JTextField diseaseNameSynonymsfield = new JTextField(30);
    private JLabel diseaseSpecialistType = new JLabel("Specialist type :");
    private JTextField diseaseSpecialistTypeField = new JTextField(30);
    private JButton addDiseaseButton = new JButton("Add Disease");


    public JTextField getDiseaseTextField() {
        return diseaseTextField;
    }

    public JTextField getDeseaseIDtextField() {
        return deseaseIDtextField;
    }

    public JTextField getDiseaseNameSynonymsfield() {
        return diseaseNameSynonymsfield;
    }

    public JTextField getDiseaseSpecialistTypeField() {
        return diseaseSpecialistTypeField;
    }

    public void healthBotWindow() {

        JPanel healthBotWindowPanel = new JPanel();

        FlowLayout fl = new FlowLayout();
        healthBotWindowPanel.setLayout(fl);

        healthBotWindowPanel.add(disease);
        healthBotWindowPanel.add(diseaseTextField);
        healthBotWindowPanel.add(deseaseID);
        healthBotWindowPanel.add(deseaseIDtextField);
        healthBotWindowPanel.add(diseaseNameSynonyms);
        healthBotWindowPanel.add(diseaseNameSynonymsfield);
        healthBotWindowPanel.add(diseaseSpecialistType);
        healthBotWindowPanel.add(diseaseSpecialistTypeField);
        healthBotWindowPanel.add(addDiseaseButton);


        JFrame frame = new JFrame("Add Disease");

        frame.setContentPane(healthBotWindowPanel);

        frame.setSize(400, 400);
        frame.setVisible(true);

        AddDiseaseActionListener pushButtonEvent = new AddDiseaseActionListener();
        addDiseaseButton.addActionListener(pushButtonEvent);

    }
}

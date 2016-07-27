package com.company.UI;

import com.company.Listeners.*;
import com.sun.deploy.panel.JSmartTextArea;

import javax.swing.*;
import java.awt.*;


public class DiseaseUI extends JFrame {

    private JLabel disease = new JLabel("Disease :");
    private JTextField diseaseTextField = new JTextField(10);
    private JLabel deseaseID = new JLabel("deseaseID :");
    private JTextField deseaseIDtextField = new JTextField(10);
    private JLabel diseaseNameSynonyms = new JLabel("diseaseNameSynonyms :");
    private JTextField diseaseNameSynonymsfield = new JTextField(30);
    private JLabel diseaseSpecialistType = new JLabel("Specialist type :");
    private JTextField diseaseSpecialistTypeField = new JTextField(30);
    private JButton addDiseaseButton = new JButton("Add Disease");
    private JButton delDiseaseButton = new JButton("Del Disease");
    private JButton getDiseaseById = new JButton("Get disease by id");
    private JTextArea textArea = new JTextArea("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextField getDiseaseTextField() {
        return diseaseTextField;
    }

    public void setDeseaseIDtextField(JTextField deseaseIDtextField) {
        this.deseaseIDtextField = deseaseIDtextField;
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

        JPanel panel = new JPanel();

        FlowLayout fl = new FlowLayout();
        panel.setLayout(fl);

        panel.add(disease);
        panel.add(diseaseTextField);
        panel.add(deseaseID);
        panel.add(deseaseIDtextField);
        panel.add(diseaseNameSynonyms);
        panel.add(diseaseNameSynonymsfield);
        panel.add(diseaseSpecialistType);
        panel.add(diseaseSpecialistTypeField);
        panel.add(addDiseaseButton);
        panel.add(delDiseaseButton);
        panel.add(getDiseaseById);
        panel.add(textArea);


        JFrame frame = new JFrame("Disease");

        frame.setContentPane(panel);

        frame.setSize(400, 400);
        frame.setVisible(true);

        AddDiseaseActionListener pushButtonEvent01 = new AddDiseaseActionListener();
        addDiseaseButton.addActionListener(pushButtonEvent01);

        DelDiseaseActionListener pushButtonEvent02 = new DelDiseaseActionListener();
        delDiseaseButton.addActionListener(pushButtonEvent02);

        GetDiseaseByIdActionListener pushButtonEvent03 = new GetDiseaseByIdActionListener();
        getDiseaseById.addActionListener(pushButtonEvent03);

    }
}

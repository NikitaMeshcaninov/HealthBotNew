package com.company;

import com.company.UI.StartUI;
import org.apache.log4j.BasicConfigurator;

public class Main {
    public static StartUI loginWindow;

    public static void main(String[] args) {
        BasicConfigurator.configure();
        loginWindow = new StartUI();
        loginWindow.healthBotLoginWindow();
    }
}

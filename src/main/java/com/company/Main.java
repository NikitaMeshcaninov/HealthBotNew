package com.company;

import com.company.UI.StartUI;

public class Main {
    public static StartUI loginWindow;

    public static void main(String[] args) {
        loginWindow = new StartUI();
        loginWindow.healthBotLoginWindow();
    }
}

package com.company.Listeners;

import com.company.Main;
import com.company.UI.SymptomUi;
import com.company.UI.UserUi;
import com.company.utils.DBWorker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Nikita on 14.07.2016.
 */
public class LoginAsUserActionListener implements ActionListener {
    public static UserUi winUser;


    @Override
    public void actionPerformed(ActionEvent e) {
            winUser = new UserUi();
            winUser.userWindow();
            Main.loginWindow.getFrame().setVisible(false);
    }
}

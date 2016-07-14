package com.company.Listeners;

import com.company.Main;
import com.company.utils.DBWorker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Nikita on 14.07.2016.
 */
public class LoginAsUserActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        DBWorker createrOfTable = new DBWorker();
        try {
            createrOfTable.createHBDiseaseTable();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }


    }
}

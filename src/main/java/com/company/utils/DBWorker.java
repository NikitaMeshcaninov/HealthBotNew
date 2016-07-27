package com.company.utils;

import com.company.Listeners.LoginAsDoctorActionListener;

import java.sql.*;
import java.text.DateFormat;
import java.util.Date;

import static com.company.Listeners.LoginAsDoctorActionListener.win;

/**
 * Created by cube on 09.07.2016.
 */
public class DBWorker {
    private String DB_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_USER = "root";
    private String DB_PASSWORD = "root";
    private String DB_CONNECTION = "jdbc:mysql://localhost:3306/hb";
    //jdbc:mysql://hostname:port/dbname
    private static int id = 1;


    private String selectTableSQL = "SELECT USER_ID, USERNAME from DBUSER";

    private static String getCurrentTimeStamp() {
        Date today = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(today.getTime());
    }

    public void testTypeFromeDB() {
        try (Connection connection = getDBConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT * FROM users")) {

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    public void createHBDiseaseTable() throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS HBDISEASE("
                + "Disease_ID INT NOT NULL, "
                + "DiseaseName VARCHAR(20) NOT NULL, "
                + "DiseaseConnections VARCHAR(100) NOT NULL, "
                + "DiseaseNameSynonymus VARCHAR(100) NOT NULL, "
                + "DiseasespecialistType VARCHAR(20) NOT NULL "
                + "PRIMARY KEY (Disease_ID) "
                + ")";

        try (Connection dbConnection = getDBConnection();
             Statement statement = dbConnection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Table \"Disease\" is created!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addDiseaseToDB() {
        String insertTableSQL = "INSERT INTO disease (name, synonymus) VALUES ('" +
                LoginAsDoctorActionListener.win.getDiseaseTextField().getText() + "' , " +
                "'" + LoginAsDoctorActionListener.win.getDiseaseNameSynonymsfield().getText() + "')";


        try (Connection dbConnection = getDBConnection();// Непонятно , что тут происходит
             PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL)) {

            preparedStatement.execute();
            System.out.println("Disease" + LoginAsDoctorActionListener.win.getDiseaseTextField().getText()
                    + "successful add to DB!!!");
            id++;
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDiseaseNameById(int id) {
        try (Connection connection = getDBConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT * FROM disease WHERE diseaseID = ?")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return rs.getString("diseaseName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

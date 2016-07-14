package com.company.utils;

import java.sql.*;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by cube on 09.07.2016.
 */
public class DBWorker {
    private String DB_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_USER = "root";
    private String DB_PASSWORD = "kd-x150";
    private String DB_CONNECTION = "jdbc:mysql://localhost:3306/hb";
    //jdbc:mysql://hostname:port/dbname
    private static int id = 1;


    private String selectTableSQL = "SELECT USER_ID, USERNAME from DBUSER";

    private static String getCurrentTimeStamp() {
        Date today = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(today.getTime());
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

    public void createDisease(String name) {
        String insertTableSQL = "INSERT INTO Disease"
                + "(diseaseName, diseaseNameSynonyms, " +
                "diseaseConnections, specialistType) VALUES";


        try (Connection dbConnection = getDBConnection();// Непонятно , что тут происходит
             PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.execute();
            System.out.println("Table \"HBDesiase\" is created!");
            id++;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDiseaseNameById(int id) {
        try (Connection connection = getDBConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT * FROM DBUSER WHERE Disease_ID = ?")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return rs.getString("Disease_ID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

package com.example.holiday;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName= "holiday";
        String databaseUser="root";
        String databasePassword="Cfl58fvu";
        String url = "jdbc:mysql://localhost" + databaseName;

        try{
            Class.forName("com.sql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}

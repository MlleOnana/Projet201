package com.example.applicationnote;

import java.sql.*;

public final class ConnexionData {

    private static Connection connection;

    public static Connection getConnection(){
        if(connection==null){
            initConnection();
        }
        return connection;
    }

    private static void initConnection() {
        try {
            String url = "jdbc:postgresql://localhost:3308/ICT2";
            String user = "postgres";
            String passwd = "onanaict";

            connection = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

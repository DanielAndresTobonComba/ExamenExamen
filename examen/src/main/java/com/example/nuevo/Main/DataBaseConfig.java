package com.example.nuevo.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConfig {

/*     private static String URL;
    private static String USER;
    private static String PASSWORD; */
    public static Connection DBconnection;
    public static String msjConnection;
    public static boolean verifyConnection;

    private static DataBaseConfig connection = new DataBaseConfig();

    private DataBaseConfig() {
        
        verifyConnection = false;

        String URL = "jdbc:mysql://localhost:3306/sgpzf";
        String USER = "root";
        String PASSWORD = "123456";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            DBconnection = DriverManager.getConnection(URL, USER, PASSWORD);
            verifyConnection = true;

            msjConnection = "\n:: :: :: :: :: :: :: :: :: :: :: ::\n:: Conectado a la Base de Datos  ::\n:: :: :: :: :: :: :: :: :: :: :: ::\n";
        } catch (SQLException msj) {
            msjConnection = "\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::\n::Error al Conectar con la db  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::\n";
        }
    }

    public static DataBaseConfig getConnection() {
        return connection;
    }
}


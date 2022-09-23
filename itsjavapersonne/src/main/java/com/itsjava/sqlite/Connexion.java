package com.itsjava.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

    public static void testConnexion() {
        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:sqlite:bdd.bd";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("La connexion est bien reel !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        testConnexion();
    }
}

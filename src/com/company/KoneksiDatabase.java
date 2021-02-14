package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author jinggasaka
 */

public class Db_Connect {
    private static Connection conn;
    public static Connection getKoneksi( ){
        String host = "jdbc:mysql://localhost/ebookshop",
                user = "root",
                pass = "root";
        try{
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage( ) );
        }
        return conn;
    }
}
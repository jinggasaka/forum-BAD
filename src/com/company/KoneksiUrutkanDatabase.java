package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class KoneksiUrutkanDatabase {
        public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","root");
            Statement stmt = con.createStatement();
            String query[] ={"SELECT * FROM books where id=1001"};
            for(String q : query){
                ResultSet rs = stmt.executeQuery(q);
                System.out.println("Names for query "+q+" are");
                while (rs.next()) {
                    String title = rs.getString("title");
                    System.out.print(title+" ");
                }
                System.out.println();
            }
        }
}

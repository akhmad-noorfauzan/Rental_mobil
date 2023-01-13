/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anfau
 */
public class koneksi {
    
    private final String url = "jdbc:mysql://localhost:3306/db_rental_mobil";
    private final String user = "root";
    private final String pass = "";
    
  
    
   

    public Connection getConnection() {
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("koneksi berhasil");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("koneksi gagal"+ex);
            return conn = null;
        }
    }
    
     public static void main(String[] args) {
        koneksi k =  new koneksi();
        k.getConnection();
    }
    
}

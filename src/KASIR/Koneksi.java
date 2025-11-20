/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KASIR;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author PC-HP
 */
public class Koneksi {
    private static Connection Database;
     
        public static Connection getConnection() throws SQLException {
            if (Database == null) {
                 // panggil Driver MySQL
                 new Driver();
                 // buat koneksi
                 Database = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirkapri", "root", "");
            }
            return Database;
        }
        
        public static void main(String args[]) {
            try {
                getConnection();
                System.out.println("SUKSES TERKONEKSI");
            } catch (SQLException ex) {
                System.err.println("Connection is Error");
        }
            }
}

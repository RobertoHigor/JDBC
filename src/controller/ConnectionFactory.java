/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Higor
 */
public class ConnectionFactory {
      public Connection getConnection() {
          
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());    
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/java", "root", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

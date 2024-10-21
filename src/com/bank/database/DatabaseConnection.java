/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author saurabh
 */
public class DatabaseConnection {
    private Connection connection;

    // Connect to the MariaDB database
    public void connect() {
        try {
            // Load the MariaDB JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Connection URL to MariaDB (replace with your own details)
            String url = "jdbc:mariadb://localhost:3306/BankDatabase";
            String user = "sv6305";
            String password = "517";

            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Connected to the database successfully!");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MariaDB Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        }
    }

    // Get the connection
    public Connection getConnection() {
        return connection;
    }

    // Close the connection when done
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                JOptionPane.showMessageDialog(null, "Connection closed successfully!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + e.getMessage());
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.gui;
import com.bank.controller.Adminlogin;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author saurabh
 */
public class MAINAPP extends JFrame {

    public MAINAPP() {
        setTitle("NOVUS Banking");
        setSize(800, 600); // Set the size of the window
        setLocationRelativeTo(null); // Center the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CustomPanel panel = new CustomPanel(); // Custom drawn panel
        add(panel);

        setVisible(true); // Show the window
    }

    public static void main(String[] args) {
        new MAINAPP();
    }
}

// Custom JPanel where the design is drawn
class CustomPanel extends JPanel {

    private JButton adminButton;
    private JButton customerButton;

    public CustomPanel() {
        setLayout(null); // Custom layout

        // Create Admin Login button
        adminButton = new JButton("Admin Login");
        adminButton.setBounds(250, 200, 300, 50); // Manually set the position
        add(adminButton);

        // Add action listener for Admin Login button
        adminButton.addActionListener(e -> { 
           Adminlogin adminLogin = new Adminlogin(); // Open Adminlogin form
            adminLogin.setVisible(true); // Display the Adminlogin window
            
        });

        // Create Customer Login button
        customerButton = new JButton("Customer Login");
        customerButton.setBounds(250, 300, 300, 50); // Manually set the position
        add(customerButton);

        // Add action listener for Customer Login button
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Customer Login Clicked");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color
        this.setBackground(new Color(0, 100, 120));

        // Draw a custom rectangle for the main content area
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(200, 150, 400, 300);

        // Draw text at the top
        g.setFont(new Font("Arial", Font.BOLD, 32));
        g.setColor(Color.WHITE);
        g.drawString("NOVUS BANKING", 250, 100);

        // Optional: Draw custom shapes or images as needed
        // For example, drawing a line or adding custom decorations
        g.setColor(Color.WHITE);
        g.drawRect(200, 150, 400, 300);
    }
}

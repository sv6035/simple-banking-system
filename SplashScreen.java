/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
public class SplashScreen extends JPanel {
    public SplashScreen() throws InterruptedException {
        JFrame frame = new JFrame("Splash Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setUndecorated(true); // Removes window decorations for a cleaner look

        // Custom panel to draw the splash content
        CustomPanel panel = new CustomPanel();
        frame.add(panel);

        frame.setVisible(true);

        // Delay to simulate loading time
        Thread.sleep(3000);

        frame.dispose(); // Close splash screen after the delay
        MAINAPP M = new MAINAPP(); // Load the main app
    }

    // Custom panel for drawing shapes and text
    static class CustomPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Background
            g2d.setColor(new Color(30, 130, 230));
            g2d.fillRect(0, 0, getWidth(), getHeight());

            // Set font and color for the slogan
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("SansSerif", Font.BOLD, 24));
            g2d.drawString("Your Financial Future, Reinvented", 120, 250); // Slogan text

            // Optionally draw the bank name as a header
            g2d.setFont(new Font("SansSerif", Font.BOLD, 30));
            g2d.drawString("Novus Banking", 200, 120); // Bank name in the oval
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new SplashScreen();
    }
}

package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw face outline (circle)
        g.drawOval(50, 50, 200, 200);

        // Draw eyes (circles)
        g.fillOval(90, 100, 40, 40);
        g.fillOval(170, 100, 40, 40);

        // Draw nose (triangle)
        int[] xPoints = {140, 130, 150};
        int[] yPoints = {150, 190, 190};
        g.drawPolygon(xPoints, yPoints, 3);

        // Draw mouth (arc)
        g.drawArc(110, 160, 80, 50, 0, -180);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Smiley Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new SmileyFace());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SmileyFace::createAndShowGUI);
    }
}
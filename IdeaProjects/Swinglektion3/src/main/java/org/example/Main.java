package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon(".idea/heart.png");
        JLabel label = new JLabel();
        label.setText("Love!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 75, 75);

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0, 0, 250, 250);
        pinkPanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250, 0, 250, 250);
        greenPanel.setLayout(null);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0, 250, 500, 250);
        yellowPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(pinkPanel);
        frame.add(greenPanel);
        frame.add(yellowPanel);

    }
}
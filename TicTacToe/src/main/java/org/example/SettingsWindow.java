package org.example;

import javax.swing.*;


public class SettingsWindow {
    JFrame frame = new JFrame();
    private JLabel title;

    SettingsWindow(){

        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        frame.add(title);

    }
}

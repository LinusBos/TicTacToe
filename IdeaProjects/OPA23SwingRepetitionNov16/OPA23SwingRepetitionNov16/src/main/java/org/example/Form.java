package org.example;

import javax.swing.*;

public class Form {
    public JFrame mainFrame = new JFrame();

    public Form(JPanel content, String title, int whatToDoOnClose, boolean visible) {
        mainFrame.setContentPane(content);
        mainFrame.setDefaultCloseOperation(whatToDoOnClose);
        mainFrame.setTitle(title);
        mainFrame.setSize(400, 400);
        mainFrame.setLocationRelativeTo(null); // Shortcut for "place in middle of screen".
        mainFrame.setVisible(visible);
    }
    public Form(JPanel content, String title, int whatToDoOnClose) {
        mainFrame.setContentPane(content);
        mainFrame.setDefaultCloseOperation(whatToDoOnClose);
        mainFrame.setTitle(title);
        mainFrame.setSize(400, 400);
        //mainFrame.setLocation(200, 200);
        mainFrame.setLocationRelativeTo(null); // Shortcut for "place in middle of screen".
        mainFrame.setVisible(true);
    }
}

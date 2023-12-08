package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SettingsWindow extends JPanel {

    JFrame frame;

    private JPanel settingsPanel;
    private JLabel titlePanel;
    private JComboBox player1ComboBox;
    private JComboBox player2ComboBox;
    private JButton colorButton;
    private JLabel colorLabel;
    private JLabel symbolLabel;
    Container c;


    SettingsWindow() {

        frame = new JFrame();

        frame.setContentPane(settingsPanel);
        frame.setTitle("Game Settings");
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ColorChooser color = new ColorChooser();
            }

        });
    }

}

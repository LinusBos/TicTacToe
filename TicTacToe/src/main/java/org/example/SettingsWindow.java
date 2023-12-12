package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SettingsWindow extends JPanel {

    private JFrame frame;

    private JPanel settingsPanel;
    private JLabel titlePanel;
    private JComboBox<String> playerOneComboBox;
    private JComboBox<String> playerTwoComboBox;
    private JButton colorButton;
    private JLabel colorLabel;
    private JLabel symbolLabel;
    private JLabel playerOneLabel;
    private JLabel playerTwoLabel;
    private JButton saveButton;
    private String playerOneSymbol, playerTwoSymbol;
    private Color buttonColor;


    public SettingsWindow() {
        playerOneSymbol = "X";
        playerTwoSymbol = "O";
        buttonColor = new Color(0,0,255);

        frame = new JFrame();

        frame.setContentPane(settingsPanel);
        frame.setTitle("Game Settings");
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ColorChooser color = new ColorChooser();
            }

        });
        playerOneComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOneSymbol = (String) playerOneComboBox.getSelectedItem();
            }
        });
        playerTwoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerTwoSymbol = (String) playerTwoComboBox.getSelectedItem();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void showWindow(Boolean bool) {
        frame.setVisible(bool);
    }
    public String getPlayerOneSymbol() {
        return playerOneSymbol;
    }

    public void setPlayerOneSymbol(String playerOneSymbol) {
        this.playerOneSymbol = playerOneSymbol;
    }

    public String getPlayerTwoSymbol() {
        return playerTwoSymbol;
    }

    public void setPlayerTwoSymbol(String playerTwoSymbol) {
        this.playerTwoSymbol = playerTwoSymbol;
    }

    public Color getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(Color buttonColor) {
        this.buttonColor = buttonColor;
    }

}

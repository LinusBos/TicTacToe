package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SettingsWindow extends JFrame {

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

        this.setContentPane(settingsPanel);
        this.setTitle("Game Settings");
        this.pack();
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ColorChooser colorChooser = new ColorChooser();
            Color selectedColor = colorChooser.getSelectedColor();

            setButtonColor(selectedColor);
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
                System.out.println("Player One Symbol: " + getPlayerOneSymbol());
                System.out.println("Player Two Symbol: " + getPlayerTwoSymbol());
                System.out.println("Button Color: " + getButtonColor());

                dispose();
            }
        });
    }
    public void showWindow(Boolean bool) {
        this.setVisible(bool);
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

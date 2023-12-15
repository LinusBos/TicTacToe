package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The SettingsWindow class allows users to change settings in the game.
// They can customize the background of the game, the player symbols
// and the symbol colors.
public class SettingsWindow extends JFrame {

    private JFrame jFrame;
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
    private JButton playerOneColorButton;
    private JButton playerTwoColorButton;
    private String playerOneSymbol, playerTwoSymbol;
    private Color buttonColor, playerOneColor, playerTwoColor;


    public SettingsWindow() {
        // Default settings for the game
        playerOneSymbol = "X";
        playerTwoSymbol = "O";
        buttonColor = new Color(173, 216, 230);
        playerOneColor = new Color(255, 0, 0);
        playerTwoColor = new Color(0, 0, 255);

        this.setContentPane(settingsPanel);
        this.setTitle("Game Settings");
        this.pack();
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);

        // Opens a color chooser to change the game background
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColorChooser colorChooser = new ColorChooser();
                Color selectedColor = colorChooser.getSelectedColor();

                setButtonColor(selectedColor);
            }

        });
        // Changes the symbol for player 1
        playerOneComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOneSymbol = (String) playerOneComboBox.getSelectedItem();
            }
        });
        // Changes the symbol for player 2
        playerTwoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerTwoSymbol = (String) playerTwoComboBox.getSelectedItem();
            }
        });
        // Opens a color chooser for player 1 symbol
        playerOneColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColorChooser colorChooser = new ColorChooser();
                Color selectedColor = colorChooser.getSelectedColor();

                setPlayerOneColor(selectedColor);
            }
        });
        // Opens a color chooser for player 2 symbol
        playerTwoColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColorChooser colorChooser = new ColorChooser();
                Color selectedColor = colorChooser.getSelectedColor();

                setPlayerTwoColor(selectedColor);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Checks if player 1 and 2 have chosen the same symbol
                if (playerOneSymbol.equals(playerTwoSymbol)) {
                    JOptionPane.showMessageDialog(jFrame, "Please choose different symbols for Player 1 and Player 2.");
                    return;
                    // Checks if any player has chosen the same symbol color as the background
                } else if(playerOneColor.equals(buttonColor) || playerTwoColor.equals(buttonColor)) {
                    JOptionPane.showMessageDialog(jFrame, "Please choose different colors for symbols and background.");
                    return;
                } else {
                    dispose();
                }
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

    public Color getPlayerOneColor() {
        return playerOneColor;
    }

    public void setPlayerOneColor(Color playerOneColor) {
        this.playerOneColor = playerOneColor;
    }

    public Color getPlayerTwoColor() {
        return playerTwoColor;
    }

    public void setPlayerTwoColor(Color playerTwoColor) {
        this.playerTwoColor = playerTwoColor;
    }
}
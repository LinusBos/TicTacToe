package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SettingsWindow extends JPanel {

    private JFrame frame;

    private JPanel settingsPanel;
    private JLabel titlePanel;
    private JComboBox player1ComboBox;
    private JComboBox player2ComboBox;
    private JButton colorButton;
    private JLabel colorLabel;
    private JLabel symbolLabel;
    private String playerOneSymbol, playerTwoSymbol;
    private Color buttonColor;
    Container c;


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
        //frame.setVisible(true);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ColorChooser color = new ColorChooser();
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

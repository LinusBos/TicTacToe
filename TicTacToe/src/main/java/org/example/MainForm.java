package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel MainPanel;
    private JPanel BottomPanel;
    private JPanel BottomRight;
    private JPanel BottomLeft;
    private JPanel TopPanel;
    private JLabel GameTitle;
    private JButton NewGameButton;
    private JButton HighscoreButton;
    private JButton SettingsButton;
    private JButton GameRulesButton;
    private SettingsWindow settingsWindow;
    private TicTacToe ticTacToe;

    private JFrame jFrame;

    public MainForm(SettingsWindow settingsWindow, TicTacToe ticTacToe) {
        this.settingsWindow = settingsWindow;
        this.ticTacToe = ticTacToe;
        jFrame = new JFrame();
        jFrame.setContentPane(MainPanel);
        jFrame.pack();
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        NewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticTacToe.showWindow(true);


            }
        });
        SettingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.showWindow(true);
            }
        });
        HighscoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        GameRulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

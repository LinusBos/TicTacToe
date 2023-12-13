package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGame extends JFrame {
    private JPanel NewGame;
    private JTextField playerOne;
    private JTextField playerTwo;
    private JCheckBox BotPlayer;
    private JComboBox botDifficultyJCB;
    private JButton startGameButton;
    private JFrame jFrame;

    private String playerOneName, playerTwoName;



    private void openTicTacToe() {
        TicTacToe ticTacToe = new TicTacToe();
        jFrame.dispose();
    }


    public NewGame() {
        jFrame = new JFrame();
        jFrame.setContentPane(NewGame);
        jFrame.pack();
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);

        botDifficultyJCB.setEnabled(false);




        BotPlayer.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                boolean currentState = BotPlayer.isSelected();
                botDifficultyJCB.setEnabled(currentState);
            }
        });
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOneName = playerOne.getText();
                playerTwoName = playerTwo.getText();
                // TODO Try catch if name is not entered, check name must be not null.

            }

          //  String player1Name = Player1.getText();
          //  String player2Name = BotPlayer.isSelected() ? "Bot (" + botDifficultyJCB.getSelectedItem() + ")" : Player2.getText();

        });
        botDifficultyJCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDifficulty = (String) botDifficultyJCB.getSelectedItem();
                Player bot = handleComboBoxSelection(selectedDifficulty);
            }
        });



    }

    private static Player handleComboBoxSelection(String selectedDifficulty) {
        switch (selectedDifficulty) {
            case "Easy":
                return new EasyBot("");
            case "Medium":
                return new MediumBot("");
        }
        return new HardBot("");
    }
}

package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGame extends JFrame {
    private JPanel NewGame;
    private JTextField playerNameFieldOne;
    private JTextField playerNameFieldTwo;
    private JCheckBox BotPlayer;
    private JComboBox botDifficultyJCB;
    private JButton startGameButton;
    private JFrame jFrame;

    private Player playerOne;
    private Player playerTwo;
    private Player bot;

    private SettingsWindow settingsWindow;

    private String playerOneName, playerTwoName;
    private Boolean botChecked = false;


    private void openTicTacToe() {
        botChecked = BotPlayer.isSelected();
        if(botChecked) {
            TicTacToe ticTacToe = new TicTacToe(playerOne, bot, settingsWindow.getButtonColor(), settingsWindow.getPlayerOneColor(), settingsWindow.getPlayerTwoColor());
            ticTacToe.showWindow(true);
            jFrame.dispose();
        } else {
            TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo, settingsWindow.getButtonColor(), settingsWindow.getPlayerOneColor(), settingsWindow.getPlayerTwoColor());
            ticTacToe.showWindow(true);
            jFrame.dispose();
        }

    }


    public NewGame(SettingsWindow settingsWindow) {
        this.settingsWindow = settingsWindow;
        jFrame = new JFrame();
        jFrame.setContentPane(NewGame);
        jFrame.pack();
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        BotPlayer.setSelected(false);
        botDifficultyJCB.setEnabled(false);


// TODO när jag tyrcker start game, ska player one skapas Player playerOne = new Player...; Symbolen ska komma från settingswindow.
        // hämta färgen från settingswindow eller tictactoefönstret
        // Om spelare två är satt som bot ska den göra samma sak men motsvara botten som är ifylld.
        // sedan göra en ny tictactoe och skicka med allt.
        // Hämta settingsWindow constructor, sedan

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
                playerOneName = playerNameFieldOne.getText();
                playerTwoName = playerNameFieldTwo.getText();
                if (playerOneName.isEmpty() || playerTwoName.isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Please enter names for both players.");
                    return;
                } else {
                    playerOne = new Player(playerNameFieldOne.getText(), settingsWindow.getPlayerOneSymbol());
                    if (BotPlayer.isSelected()) {
                        String selectedDifficulty = (String) botDifficultyJCB.getSelectedItem();
                        bot = handleComboBoxSelection(selectedDifficulty);
                        botChecked = true;
                    } else {
                        playerTwo = new Player(playerNameFieldTwo.getText(), settingsWindow.getPlayerTwoSymbol());
                    }

                }
                openTicTacToe();
            }
        });

        botDifficultyJCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDifficulty = (String) botDifficultyJCB.getSelectedItem();
                System.out.println(selectedDifficulty);
                bot = handleComboBoxSelection(selectedDifficulty);
                botChecked = true;
            }
        });



    }

    private Player handleComboBoxSelection(String selectedDifficulty) {
        switch (selectedDifficulty) {
            case "Easy":
                return new EasyBot(playerTwoName, settingsWindow.getPlayerTwoSymbol());
            case "Medium":
                return new MediumBot(playerTwoName,settingsWindow.getPlayerTwoSymbol());
        }
        return new HardBot(playerTwoName,settingsWindow.getPlayerTwoSymbol());
    }

    public void showWindow (boolean bool) {
        jFrame.setVisible(bool);
    }
}

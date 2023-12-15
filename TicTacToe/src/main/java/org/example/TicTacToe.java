package org.example;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    private JFrame frame = new JFrame();

    private JPanel scorePanel = new JPanel();

    private JLabel textField = new JLabel();
    private JPanel button_panel = new JPanel();

    private static JButton[] buttons = new JButton[9];

    private boolean playerOneTurn, playerTwoTurn, gameOver;
    private Color buttonColor, playerOneColor, playerTwoColor;
    private static String playerOneSymbol;
    private static String playerTwoSymbol;
    private Player playerOne;
    private Player playerTwo;

    public TicTacToe(Player playerOne, Player playerTwo, Color buttonColor, Color playerOneColor, Color playerTwoColor) {
        this.playerOneSymbol = playerOne.getSymbol();
        this.playerTwoSymbol = playerTwo.getSymbol();
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.buttonColor = buttonColor;
        this.playerOneColor = playerOneColor;
        this.playerTwoColor = playerTwoColor;
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setLayout(new BorderLayout());


        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Arial", Font.BOLD, 80));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Score?");
        textField.setOpaque(true);

        scorePanel.setLayout(new BorderLayout());
        scorePanel.setBounds(0, 0, 800, 100);


        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));
        createButton();

        scorePanel.add(textField);
        frame.add(scorePanel, BorderLayout.NORTH);
        frame.add(button_panel);
        frame.setLocationRelativeTo(null);
        playerOneTurn = true;
        playerTwoTurn = false;
        gameOver = false;


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if player two is also a player and not a bot.
        if(playerOne.getClass() ==  playerTwo.getClass()) {
            for (int i = 0; i < 9; i++) {
                if (e.getSource() == buttons[i]) {
                    if (playerOneTurn && !gameOver) {
                        if (buttons[i].getText() == "") {
                            buttons[i].setForeground(playerOneColor);
                            buttons[i].setText(playerOneSymbol);
                            playerOneTurn = false;
                            playerTwoTurn = true;
                            textField.setText(playerTwo.getName() + " turn");
                            checkWinner();


                        }
                    } else if (playerTwoTurn && !gameOver){ //Player two pressed
                        if (buttons[i].getText() == "") {
                            buttons[i].setForeground(playerTwoColor);
                            buttons[i].setText(playerTwoSymbol);
                            playerTwoTurn = false;
                            playerOneTurn = true;
                            textField.setText(playerOne.getName() + " turn");
                            checkWinner();


                        }
                    }
                }
            }
        }else { // If playerTwo is a bot
            for (int i=0; i<9; i++) {
                if (e.getSource()==buttons[i]) {
                    if (playerOneTurn){
                        if (buttons[i].getText() == "") {
                            buttons[i].setForeground(playerOneColor);
                            buttons[i].setText(playerOneSymbol);
                            playerOneTurn = false;
                            playerTwoTurn = true;
                            textField.setText(playerTwo.getName() + " turn");
                            checkWinner();
                        }
                    }

                }
            }
            if (playerTwoTurn && !gameOver) {
                int index = playerTwo.makeMove(buttons);
                buttons[index].setForeground(playerTwoColor);
                buttons[index].setText(playerTwoSymbol);
                playerOneTurn = true;
                playerTwoTurn = false;
                textField.setText(playerOne.getName() + " turn");
                checkWinner();
            }

        }

    }




    private void createButton() {
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(buttonColor);
        }
    }

    private void checkWinner() {
        if (
                (buttons[0].getText() == playerOneSymbol) &&
                        (buttons[1].getText() == playerOneSymbol) &&
                        (buttons[2].getText() == playerOneSymbol)
        ) {
            xWins(0, 1, 2);
        }
        if (
                (buttons[3].getText() == playerOneSymbol) &&
                        (buttons[4].getText() == playerOneSymbol) &&
                        (buttons[5].getText() == playerOneSymbol)
        ) {
            xWins(3, 4, 5);
        }
        if (
                (buttons[6].getText() == playerOneSymbol) &&
                        (buttons[7].getText() == playerOneSymbol) &&
                        (buttons[8].getText() == playerOneSymbol)
        ) {
            xWins(6, 7, 8);
        }
        if (
                (buttons[0].getText() == playerOneSymbol) &&
                        (buttons[3].getText() == playerOneSymbol) &&
                        (buttons[6].getText() == playerOneSymbol)
        ) {
            xWins(0, 3, 6);
        }
        if (
                (buttons[1].getText() == playerOneSymbol) &&
                        (buttons[4].getText() == playerOneSymbol) &&
                        (buttons[7].getText() == playerOneSymbol)
        ) {
            xWins(1, 4, 7);
        }
        if (
                (buttons[2].getText() == playerOneSymbol) &&
                        (buttons[5].getText() == playerOneSymbol) &&
                        (buttons[8].getText() == playerOneSymbol)
        ) {
            xWins(2, 5, 8);
        }
        if (
                (buttons[0].getText() == playerOneSymbol) &&
                        (buttons[4].getText() == playerOneSymbol) &&
                        (buttons[8].getText() == playerOneSymbol)
        ) {
            xWins(0, 4, 8);
        }
        if (
                (buttons[2].getText() == playerOneSymbol) &&
                        (buttons[4].getText() == playerOneSymbol) &&
                        (buttons[6].getText() == playerOneSymbol)
        ) {
            xWins(2, 4, 6);
        }

        //check O win conditions
        if (
                (buttons[0].getText() == playerTwoSymbol) &&
                        (buttons[1].getText() == playerTwoSymbol) &&
                        (buttons[2].getText() == playerTwoSymbol)
        ) {
            oWins(0, 1, 2);
        }
        if (
                (buttons[3].getText() == playerTwoSymbol) &&
                        (buttons[4].getText() == playerTwoSymbol) &&
                        (buttons[5].getText() == playerTwoSymbol)
        ) {
            oWins(3, 4, 5);
        }
        if (
                (buttons[6].getText() == playerTwoSymbol) &&
                        (buttons[7].getText() == playerTwoSymbol) &&
                        (buttons[8].getText() == playerTwoSymbol)
        ) {
            oWins(6, 7, 8);
        }
        if (
                (buttons[0].getText() == playerTwoSymbol) &&
                        (buttons[3].getText() == playerTwoSymbol) &&
                        (buttons[6].getText() == playerTwoSymbol)
        ) {
            oWins(0, 3, 6);
        }
        if (
                (buttons[1].getText() == playerTwoSymbol) &&
                        (buttons[4].getText() == playerTwoSymbol) &&
                        (buttons[7].getText() == playerTwoSymbol)
        ) {
            oWins(1, 4, 7);
        }
        if (
                (buttons[2].getText() == playerTwoSymbol) &&
                        (buttons[5].getText() == playerTwoSymbol) &&
                        (buttons[8].getText() == playerTwoSymbol)
        ) {
            oWins(2, 5, 8);
        }
        if (
                (buttons[0].getText() == playerTwoSymbol) &&
                        (buttons[4].getText() == playerTwoSymbol) &&
                        (buttons[8].getText() == playerTwoSymbol)
        ) {
            oWins(0, 4, 8);
        }
        if (
                (buttons[2].getText() == playerTwoSymbol) &&
                        (buttons[4].getText() == playerTwoSymbol) &&
                        (buttons[6].getText() == playerTwoSymbol)
        ) {
            oWins(2, 4, 6);
        }
        if(!gameOver) {
            boolean draw = true;
            for (int i = 0; i < 9; i++) {
                if (buttons[i].getText().equals("")) {
                    draw = false;
                    break;
                }
            }

            if (draw) {
                handleDraw();
            }
        }

    }

    private void handleDraw() {
        textField.setText("It's a draw!");

        int option = JOptionPane.showConfirmDialog(frame, "It's a draw! Do you want to play again?", "Game Over", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            resetGame();
        } else {
            frame.dispose();
        }
    }

    /**
     *
     * @param a coordinate that x has to win
     * @param b coordinate that x has to win
     * @param c coordinate that x has to win
     */
    private void xWins(int a, int b, int c) {
        gameOver = true;
        setWinningBackground(a, b, c);
        disableButtons();
        textField.setText(playerOne.getName() + " wins");

        int option = JOptionPane.showConfirmDialog(frame,  playerOne.getName() + " wins! Do you want to play again?", "Game Over", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            resetGame();
        } else {
            frame.dispose();
        }
    }

    /**
     * @param a coordinate that o has to win.
     * @param b coordinate that o has to win.
     * @param c coordinate that o has to win.
     */
    private void oWins(int a, int b, int c) {
        gameOver = true;
        setWinningBackground(a, b, c);
        disableButtons();
            textField.setText(playerTwo.getName() + " wins");

            int option = JOptionPane.showConfirmDialog(frame, playerTwo.getName()+" wins! Do you want to play again?", "Game Over", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                resetGame();
            } else {
                frame.dispose();
        }
    }

    /**
     * @param a coordinate that should be changed.
     * @param b coordinate that should be changed.
     * @param c coordinate that should be changed.
     */
    private void setWinningBackground(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
    }

    private void disableButtons() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
    }

    /**
     *
     * @param bool true shows window.
     */
    public void showWindow(Boolean bool) {
        frame.setVisible(bool);
    }

    private void resetGame() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
            buttons[i].setBackground(buttonColor);
        }


        playerOneTurn = true;
        playerTwoTurn = false;
        gameOver = false;

        textField.setText(playerOne.getName() + " turn");
    }

}

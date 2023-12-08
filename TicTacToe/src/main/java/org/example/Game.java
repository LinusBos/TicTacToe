package org.example;

/*public class Game {
    private boolean gameDone;

    public Game() {
        gameDone = false;
    }


    public void startGame(){
      // Fill with code that should not be looped.
      gameLoop();
    }
    private void gameLoop(){
        /*
        while(!gameDone) {

        }


    }
}
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Game implements ActionListener {
    private int row, col;
    private GamePlan gamePlan;

    public Game(int row, int col, GamePlan gamePlan) {
        this.row = row;
        this.col = col;
        this.gamePlan = gamePlan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton[][] buttons = gamePlan.getButtons();

        if (buttons[row][col].getText().isEmpty()) {
            buttons[row][col].setText(String.valueOf(gamePlan.getCurrentPlayer()));

            if (gamePlan.checkWin()) {
                JOptionPane.showMessageDialog(null, "Player " + gamePlan.getCurrentPlayer() + " wins!");
                gamePlan.resetGame();
            } else if (gamePlan.isBoardFull()) {
                JOptionPane.showMessageDialog(null, "It's a tie!");
                gamePlan.resetGame();
            } else {
                gamePlan.switchPlayer();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid move. Try again.");
        }
    }
}
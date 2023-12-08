package org.example;

/*public class GamePlan {
    private int gameField[][];

    /**
     * @param size of the gamefield e.g. 3*3

    public GamePlan(int size) {
        gameField = new int[size][size];
    }
}
*/
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class GamePlan extends JFrame {
    private JButton[][] buttons;
    private char currentPlayer;

    public GamePlan() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttons = new JButton[3][3];
        currentPlayer = 'X';

        initializeButtons();
        setLayout(new GridLayout(3, 3));
    }

    private void initializeButtons() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
                buttons[row][col].setFocusPainted(false);
                buttons[row][col].addActionListener(new ButtonClickListener(row, col, this));
                add(buttons[row][col]);
            }
        }
    }
    public boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(currentPlayer)) &&
                    buttons[i][1].getText().equals(String.valueOf(currentPlayer)) &&
                    buttons[i][2].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (buttons[0][i].getText().equals(String.valueOf(currentPlayer)) &&
                    buttons[1][i].getText().equals(String.valueOf(currentPlayer)) &&
                    buttons[2][i].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }
        }

        // Check diagonals
        if (buttons[0][0].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[1][1].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[2][2].getText().equals(String.valueOf(currentPlayer))) {
            return true;
        }
        if (buttons[0][2].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[1][1].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[2][0].getText().equals(String.valueOf(currentPlayer))) {
            return true;
        }

        return false;
    }

    public void resetGame() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setText("");
            }
        }
        currentPlayer = 'X';
    }

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().isEmpty()) {
                    return false; // If any button is empty, the board is not full
                }
            }
        }
        return true; // All buttons are filled, the board is full
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public JButton[][] getButtons() {
        return buttons;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GamePlan gamePlan = new GamePlan();
            gamePlan.show();
        });
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();

        SwingUtilities.invokeLater(() -> {
            TicTacToe game = new TicTacToe();
            game.setVisible(true);
        });


    }
}
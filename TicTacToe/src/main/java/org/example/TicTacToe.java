package org.example;


import javax.swing.*;

public class TicTacToe extends JFrame {
    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePlan gamePlan = new GamePlan();
        add(gamePlan);

        pack();
        setLocationRelativeTo(null);
    }
}

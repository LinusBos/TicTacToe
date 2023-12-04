package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Exercise4 {
    private JLabel messageLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel exercise4Panel;

    boolean nextIsX = true;

    private Form form;

    ArrayList<JButton> winLine1 = new ArrayList<>();
    ArrayList<JButton> winLine2 = new ArrayList<>();
    ArrayList<JButton> winLine3 = new ArrayList<>();
    ArrayList<JButton> winLine4 = new ArrayList<>();
    ArrayList<JButton> winLine5 = new ArrayList<>();
    ArrayList<JButton> winLine6 = new ArrayList<>();
    ArrayList<JButton> winLine7 = new ArrayList<>();
    ArrayList<JButton> winLine8 = new ArrayList<>();

    ArrayList<ArrayList<JButton>> winLists = new ArrayList<>();

    /*Skapa Tic-Tac-Toe. Arrangera nio knappar. Varannan man trycker på blir texten i knappen
      man tryckte till kryss och cirkel var. buttonName.setText() kan användas till det. Om tre av
      samma tecken blir i rad så vinner den spelaren.*/
    public Exercise4() {
        winLine1.add(button1);
        winLine1.add(button2);
        winLine1.add(button3);

        winLine2.add(button4);
        winLine2.add(button5);
        winLine2.add(button6);

        winLine3.add(button7);
        winLine3.add(button8);
        winLine3.add(button9);

        winLine4.add(button1);
        winLine4.add(button4);
        winLine4.add(button7);

        winLine5.add(button2);
        winLine5.add(button5);
        winLine5.add(button8);

        winLine6.add(button3);
        winLine6.add(button6);
        winLine6.add(button9);

        winLine7.add(button1);
        winLine7.add(button5);
        winLine7.add(button9);

        winLine8.add(button3);
        winLine8.add(button5);
        winLine8.add(button7);

        winLists.add(winLine1);
        winLists.add(winLine2);
        winLists.add(winLine3);
        winLists.add(winLine4);
        winLists.add(winLine5);
        winLists.add(winLine6);
        winLists.add(winLine7);
        winLists.add(winLine8);

        form = new Form(exercise4Panel, "Exercise 4", JFrame.DISPOSE_ON_CLOSE);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton)e.getSource();
                if (button.getText().equals("") && victory == false) {
                    numberOfMoves++;
                    if (nextIsX) {
                        button.setText("X");
                        nextIsX = false;
                    } else {
                        button.setText("O");
                        nextIsX = true;
                    }
                    checkVictory();
                }
            }
        };

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        button6.addActionListener(actionListener);
        button7.addActionListener(actionListener);
        button8.addActionListener(actionListener);
        button9.addActionListener(actionListener);
    }

    int numberOfMoves = 0;
    boolean victory = false;

    private void checkVictory() {
        for (ArrayList<JButton> winList: winLists) {
            String letter = winList.get(0).getText();
            if (!letter.equals("")) {
                if (winList.get(1).getText().equals(letter)
                    &&
                    winList.get(2).getText().equals(letter)) {
                    messageLabel.setText(letter + " has won!");
                    victory = true;
                }
            }
        }

        if (numberOfMoves == 9 && victory == false) {
            messageLabel.setText("It's a draw!");
        }
    }
}

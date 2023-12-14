package org.example;

import javax.swing.*;
import java.util.Random;

public class EasyBot extends Player {

    private Random random = new Random();
    public EasyBot(String name, String symbol) {
        super(name, symbol);
    }

    public int makeMove(JButton[] buttonsList) {
        int randomIndex = random.nextInt(0,9);
        int chosenIndex = 0;
        boolean emptyButtonFound = false;
        while (!emptyButtonFound) {
            if (buttonsList[randomIndex].getText().isEmpty()) {
                chosenIndex = randomIndex;
                emptyButtonFound = true;
            }else {
                randomIndex = random.nextInt(0, 9);
            }
        }

        return chosenIndex;
    }

}

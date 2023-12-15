package org.example;

import javax.swing.*;

public class Player {
    private String name;
    private String symbol;
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param jButtonList a list of the buttons in the game.
     * @return an index that next symbol should be placed at.
     */
    public int makeMove(JButton[] jButtonList) {
        return 0;
    }

}

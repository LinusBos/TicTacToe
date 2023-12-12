package org.example;

public class Game {
    private boolean gameDone;

    public Game() {
        gameDone = false;
    }
    public void menu() {

        SettingsWindow settingsWindow = new SettingsWindow();
        TicTacToe ticTacToe = new TicTacToe(settingsWindow.getPlayerOneSymbol(),settingsWindow.getPlayerTwoSymbol());
        //get name from newGameWindow
        Player playerOne = new Player("Martin", settingsWindow.getPlayerOneSymbol());
        //check if player from newGameWindow
        Player playerTwo = new Player("Diana", settingsWindow.getPlayerTwoSymbol());
        // check else-if easyBot
        // check else-if mediumBot
        // check else-if hardBot
        MainForm mainForm = new MainForm(settingsWindow, ticTacToe);
    }


    public void startGame(){

    }

    private void gameLoop(){




    }
}

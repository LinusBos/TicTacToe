package org.example;

public class Game {
    private boolean gameDone;

    public Game() {
        gameDone = false;
    }
    public void menu() {

        SettingsWindow settingsWindow = new SettingsWindow();

        //get name from newGameWindow
        Player playerOne = new Player("Martin", settingsWindow.getPlayerOneSymbol());
        //check if player from newGameWindow
        Player playerTwo = new Player("Diana", settingsWindow.getPlayerTwoSymbol());
        // TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);
        NewGame newGame = new NewGame(settingsWindow);
        // check else-if easyBot
        // check else-if mediumBot
        // check else-if hardBot
        MainForm mainForm = new MainForm(settingsWindow, newGame);
    }


    public void startGame(){

    }

    private void gameLoop(){




    }
}

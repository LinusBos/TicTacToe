package org.example;

import javax.swing.*;
import java.util.Random;

public class MediumBot extends Player {
    private Random random = new Random();
    public MediumBot(String name, String symbol) {
        super(name, symbol);
    }
    @Override
    public int makeMove(JButton[] buttonsList) {

        int chosenIndex = 0;

        for (int i = 0; i<9; i++) {
            if (buttonsList[i].getText().equals(getSymbol())) {
                // if i = (0,2,4,6,8) check diagonals
                if (i % 2 == 0) {
                    // special case if center
                    if (i == 4) {
                        // check diagonal left above
                        if (buttonsList[0].getText().isEmpty()) {
                            chosenIndex = 0;
                            return chosenIndex;
                        }
                        // check diagonal right above
                        else if (buttonsList[2].getText().isEmpty()) {
                            chosenIndex = 2;
                            return chosenIndex;
                        }
                        // check diagonal left below
                        else if (buttonsList[6].getText().isEmpty()) {
                            chosenIndex = 6;
                            return chosenIndex;
                        }
                        // check diagonal right below
                        else if (buttonsList[8].getText().isEmpty()) {
                            chosenIndex = 8;
                            return chosenIndex;
                        }
                        // After center checked, corners only need to look at middle
                        // if bot has a symbol in corner and middle
                    } else if (buttonsList[4].getText().equals(getSymbol())) {
                        if (i == 0 && buttonsList[8].getText().isEmpty()) {
                            chosenIndex = 8;
                            return chosenIndex;
                        } else if (i == 2 && buttonsList[6].getText().isEmpty()) {
                            chosenIndex = 6;
                            return chosenIndex;
                        } else if (i == 6 && buttonsList[2].getText().isEmpty()) {
                            chosenIndex = 2;
                            return chosenIndex;
                        } else if (i == 8 && buttonsList[0].getText().isEmpty()) {
                            chosenIndex = 0;
                            return chosenIndex;
                        }
                    }
                    // if bot doesn't have middle but has a corner.
                    else if (i == 0) {
                        if (buttonsList[6].getText().isEmpty()) {
                            chosenIndex = 6;
                            return chosenIndex;
                        } else if (buttonsList[6].getText().equals(getSymbol()) && buttonsList[3].getText().isEmpty()) {
                            chosenIndex = 3;
                            return chosenIndex;
                        } else if (buttonsList[2].getText().isEmpty()) {
                            chosenIndex = 2;
                            return chosenIndex;
                        } else if (buttonsList[2].getText().equals(getSymbol()) && buttonsList[1].getText().isEmpty()) {
                            chosenIndex = 1;
                            return chosenIndex;
                        }
                    } else if (i == 2) {
                        if (buttonsList[0].getText().isEmpty()) {
                            chosenIndex = 0;
                            return chosenIndex;
                        } else if (buttonsList[0].getText().equals(getSymbol()) && buttonsList[1].getText().isEmpty()) {
                            chosenIndex = 1;
                            return chosenIndex;
                        } else if (buttonsList[8].getText().isEmpty()) {
                            chosenIndex = 8;
                            return chosenIndex;
                        } else if (buttonsList[8].getText().equals(getSymbol()) && buttonsList[5].getText().isEmpty()) {
                            chosenIndex = 5;
                            return chosenIndex;
                        }

                    } else if (i == 6) {
                        if (buttonsList[0].getText().isEmpty()) {
                            chosenIndex = 0;
                            return chosenIndex;
                        } else if (buttonsList[0].getText().equals(getSymbol()) && buttonsList[3].getText().isEmpty()) {
                            chosenIndex = 3;
                            return chosenIndex;
                        } else if (buttonsList[8].getText().isEmpty()) {
                            chosenIndex = 8;
                            return chosenIndex;
                        } else if (buttonsList[8].getText().equals(getSymbol()) && buttonsList[7].getText().isEmpty()) {
                            chosenIndex = 7;
                            return chosenIndex;
                        }

                    } else if (i == 8) {
                        if (buttonsList[6].getText().isEmpty()) {
                            chosenIndex = 6;
                            return chosenIndex;
                        } else if (buttonsList[6].getText().equals(getSymbol()) && buttonsList[7].getText().isEmpty()) {
                            chosenIndex = 7;
                            return chosenIndex;
                        } else if (buttonsList[2].getText().isEmpty()) {
                            chosenIndex = 2;
                            return chosenIndex;
                        } else if (buttonsList[2].getText().equals(getSymbol()) && buttonsList[5].getText().isEmpty()) {
                            chosenIndex = 5;
                            return chosenIndex;
                        }
                    }
                }
            }
        }

        // if no bot symbol was found.
        if(buttonsList[4].getText().isEmpty())
        {
            chosenIndex = 4;
            return chosenIndex;
        } else if(buttonsList[0].getText().isEmpty()) {
            chosenIndex = 0;
            return chosenIndex;
        } else if(buttonsList[2].getText().isEmpty()) {
            chosenIndex = 2;
            return chosenIndex;
        } else if(buttonsList[6].getText().isEmpty()) {
            chosenIndex = 6;
            return chosenIndex;
        } else if(buttonsList[8].getText().isEmpty()) {
            chosenIndex = 8;
            return chosenIndex;
        }


        int randomIndex = random.nextInt(0,9);
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


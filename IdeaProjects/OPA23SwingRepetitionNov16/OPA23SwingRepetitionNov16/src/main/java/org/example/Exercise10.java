package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise10 {
    private JPanel exercise10Panel;
    private JButton turnLeftButton;
    private JButton driveForwardButton;
    private JButton turnRightButton;
    private JButton accelerateButton;
    private JButton brakeButton;
    private JLabel messageLabel;
    private JLabel destinationXLabel;
    private JLabel destinationYLabel;
    private JLabel currentXLabel;
    private JLabel currentYLabel;
    private JLabel currentSpeedLabel;
    private JLabel currentDirectionLabel;
    private Form form;

    // enums can contain only the values we define here.
    enum Direction {
        North,
        West,
        South,
        East
    }

    // We can then create a variable of the type of enum we created,
    // and give it one of the values we defined like this.
    Direction direction = Direction.North;

    int destinationX = 43;
    int destinationY = -67;

    int currentX = 0;
    int currentY = 0;
    int currentSpeed = 0;

    /*Du är i en bil. Det finns en gaspedal (en knapp), bromspedal (knapp) och en ratt du kan välja
      att styra vänster (knapp), höger (knapp) eller rakt fram (knapp). Om man trycker på
      gaspedalen så ökas en variabel som håller koll på ens fart, på bromsen så saktar man ned.
      Trycker man på framåt-knappen åker man framåt ett avstånd som bestäms av hur fort man
      åker. Håll koll på användarens nuvarande koordinater med två värden, en som bestämmer
      hur långt norr man är och en som håller koll på hur långt söderut man är.

      Svänger man, ändra en variabel som håller koll på vilket håll man är på väg. Om man är på
      väg norrut men svänger vänster är man nu på väg västerut. Vilket håll man är på väg mot
      skall påverka hur ens koordinater påverkas av att köra framåt. Ha en destination som är
      också ett par med koordinater. Skriv ut att spelaren har vunnit om de kommer fram till sagda
      koordinater. De kommer behöva gasa/bromsa för att exakt komma fram till sin destination.*/
    public Exercise10() {
        form = new Form(exercise10Panel, "Exercise 10", JFrame.DISPOSE_ON_CLOSE);

        destinationXLabel.setText("X: " + destinationX);
        destinationYLabel.setText("Y: " + destinationY);
        currentXLabel.setText("X: " + currentX);
        currentYLabel.setText("Y: " + currentY);
        currentSpeedLabel.setText("Currently driving in " + currentSpeed + "km/h.");
        currentDirectionLabel.setText("Currently heading " + direction.toString());

        driveForwardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (direction) {
                    case North:
                        currentY -= currentSpeed;
                        break;
                    case West:
                        currentX -= currentSpeed;
                        break;
                    case South:
                        currentY += currentSpeed;
                        break;
                    case East:
                        currentX += currentSpeed;
                        break;
                }
                currentXLabel.setText("X: " + currentX);
                currentYLabel.setText("Y: " + currentY);
                if (currentX == destinationX && currentY == destinationY) {
                    messageLabel.setText("You have arrived!");
                }
            }
        });

        turnLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (direction) {
                    case North:
                        direction = Direction.West;
                        break;
                    case West:
                        direction = Direction.South;
                        break;
                    case South:
                        direction = Direction.East;
                        break;
                    case East:
                        direction = Direction.North;
                        break;
                }
                currentDirectionLabel.setText("Currently heading " + direction.toString());
            }
        });
        turnRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (direction) {
                    case North:
                        direction = Direction.East;
                        break;
                    case West:
                        direction = Direction.North;
                        break;
                    case South:
                        direction = Direction.West;
                        break;
                    case East:
                        direction = Direction.South;
                        break;
                }
                currentDirectionLabel.setText("Currently heading " + direction.toString());
            }
        });

        accelerateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSpeed++;
                currentSpeedLabel.setText("Currently driving in " + currentSpeed + "km/h.");
            }
        });
        brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSpeed--;
                currentSpeedLabel.setText("Currently driving in " + currentSpeed + "km/h.");
            }
        });
    }
}

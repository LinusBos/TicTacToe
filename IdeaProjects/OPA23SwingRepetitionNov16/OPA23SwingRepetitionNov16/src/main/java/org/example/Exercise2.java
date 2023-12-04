package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Exercise2 {
    private JPanel exercise2Panel;
    private JButton nextStringButton;
    private JLabel showStringLabel;

    private Form exercise2Form;

    ArrayList<String> stringList = new ArrayList<>();
    int currentIndex = 0;

    /*Ha en label, en knapp och en lista av strings. I början visas första stringen i listan i vår label.
      När man trycker på knappen så ändras texten i en label till att gå till nästa string i listan. När
      man nått slutet av listan av strings, börja om från början av listan.
    * */
    public Exercise2() {
        exercise2Form = new Form(exercise2Panel, "Exercise 2", JFrame.DISPOSE_ON_CLOSE);

        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");

        showStringLabel.setText(stringList.get(currentIndex));

        nextStringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex++;

                if (currentIndex >= stringList.size()) {
                    currentIndex = 0;
                }

                showStringLabel.setText(stringList.get(currentIndex));
            }
        });
    }
}

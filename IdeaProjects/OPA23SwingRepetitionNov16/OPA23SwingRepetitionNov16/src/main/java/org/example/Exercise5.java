package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Exercise5 {


    private JPanel exercise5Panel;
    private JList ingredienceJList;
    private JButton addIngredienceButton;
    private JButton finishOrderButton;
    private JTextArea finishedOrderArea;
    private JLabel messageLabel;

    private Form form;

    DefaultListModel defaultListModel = new DefaultListModel();

    ArrayList<String> order = new ArrayList<>();

    /*Beställ en burgare. Ha en lista av ingredienser i en JList, och varje gång man klickar på en
      knapp ”Add” så lägger man till den ingrediensen till burgaren. Borde nog vara en egen lista.
      Trycker man på en ”Finish Order” knapp så skriver den ut en full lista av allting man beställt.*/
    public Exercise5() {
        form = new Form(exercise5Panel, "Exercise 5", JFrame.DISPOSE_ON_CLOSE);

        form.mainFrame.setSize(700, 400);

        ingredienceJList.setModel(defaultListModel);

        defaultListModel.addElement("Bread");
        defaultListModel.addElement("Beef");
        defaultListModel.addElement("Cheese");
        defaultListModel.addElement("Bacon");
        defaultListModel.addElement("Salad");
        defaultListModel.addElement("Sauce");
        defaultListModel.addElement("Onion");
        defaultListModel.addElement("Pineapple");

        addIngredienceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingredient = (String)ingredienceJList.getSelectedValue();
                order.add(ingredient);
                messageLabel.setText(ingredient + " was added to your burger!");
            }
        });
        finishOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String myString = "Ordered burger with the following ingredients: ";

                for (String str : order) {
                    myString += "\n" + str;
                }

                finishedOrderArea.setText(myString);
            }
        });
    }
}

package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise6 {
    private JList availableList;
    private JList orderList;
    private JButton addButton;
    private JButton removeButton;
    private JLabel messageLabel;
    private JPanel exercise6List;

    /*Kan du skapa en ny JList som innehåller alla sakerna man håller på att beställa, så att man
      kan trycka på en av ingredienserna och ta bort den med en Remove-knapp ifall man ändrar
      sig?*/
    private Form form;
    DefaultListModel availableListModel = new DefaultListModel();
    DefaultListModel orderListModel = new DefaultListModel();

    public Exercise6() {
        form = new Form(exercise6List, "Exercise 6", JFrame.DISPOSE_ON_CLOSE);
        availableList.setModel(availableListModel);
        orderList.setModel(orderListModel);

        availableListModel.addElement("Bread");
        availableListModel.addElement("Beef");
        availableListModel.addElement("Cheese");
        availableListModel.addElement("Bacon");
        availableListModel.addElement("Salad");
        availableListModel.addElement("Sauce");
        availableListModel.addElement("Onion");
        availableListModel.addElement("Pineapple");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingredient = (String)availableList.getSelectedValue();
                if (ingredient != null) {
                    orderListModel.addElement(ingredient);
                    messageLabel.setText(ingredient + " was added to your burger!");
                }
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexToRemove = orderList.getSelectedIndex();
                if (indexToRemove >= 0) {
                    String ingredient = (String) orderList.getSelectedValue();

                    orderListModel.remove(indexToRemove);
                    messageLabel.setText(ingredient + " was removed from your burger!");
                }
            }
        });
    }
}

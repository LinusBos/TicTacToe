package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Exercise8 {
    private JPanel exercise8Panel;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton logInButton;

    Form form;
    ArrayList<Exercise8User> users = new ArrayList<>();

    /*Expandera på föregående uppgift. Vi skall kunna logga in på bankomaten. Skapa en ny sida
      som är inloggning, användarnamn och lösenord. Ha en lista av användare i bakgrunden, med
      användarnamn, lösenord och hur mycket pengar de har. Skriver man in rätt lösenord för
      någon av användarna så kommer man till fönstret i förra uppgiften, men den användarens
      pengar som värde.*/
    public Exercise8() {
        form = new Form(exercise8Panel, "Exercise 8", JFrame.DISPOSE_ON_CLOSE);

        users.add(new Exercise8User("jim", "123", 1000));
        users.add(new Exercise8User("bob", "obo", 1500));
        users.add(new Exercise8User("greg", "987", 650));

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (!username.equals("") && !password.equals("")) {
                    for (Exercise8User user : users) {
                        if (username.equals(user.getUsername()) &&
                            password.equals(user.getPassword())) {
                            Exercise7 exercise7 = new Exercise7();
                            exercise7.fromExercise8(user);
                        }
                    }
                }
            }
        });
    }
}

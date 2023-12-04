package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise7 {

    Form form;
    private JPanel exercise7panel;
    private JTextField numberInputField;
    private JButton depositButton;
    private JButton withdrawButton;
    private JLabel currentMoneyLabel;
    private JLabel messageLabel;

    Exercise8User user = new Exercise8User("", "", 1000);

    /*Skapa en bankomat. Det finns två knappar, två labels och ett text-fält. Visa alltid hur mycket
      pengar som finns i en label. I text-fältet skall man skriva in nummer. Ifall man skriver ett
      nummer och trycker på knappen Deposit, lägg till det antalet till numret till andelen pengar.
      Ifall man skriver in ett nummer och trycker Withdraw, så ta bort det antalet från andelen
      pengar i bankomaten, om det inte är så att det inte finns tillräckligt. Skriv då istället i den
      andra labeln att det inte finns tillräckligt med pengar. Om man skriver in någonting som inte
      är en andel pengar, så skriv i den separata labeln att det man skrev inte var ett nummer*/
    public Exercise7() {
        form = new Form(exercise7panel, "Exercise 7", JFrame.DISPOSE_ON_CLOSE);

        currentMoneyLabel.setText("Current balance: " + user.getBalance());

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int moneyToDeposit = Integer.parseInt(numberInputField.getText());
                    user.setBalance(user.getBalance() + moneyToDeposit);
                    currentMoneyLabel.setText("Current balance: " + user.getBalance());
                    messageLabel.setText("Successfully deposited " + moneyToDeposit + " kr.");
                }
                catch (Exception ex) {
                    messageLabel.setText("Please only deposit numbers.");
                }
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int moneyToWithdraw = Integer.parseInt(numberInputField.getText());
                    if (user.getBalance() >= moneyToWithdraw) {
                        user.setBalance(user.getBalance() - moneyToWithdraw);
                        currentMoneyLabel.setText("Current balance: " + user.getBalance());
                        messageLabel.setText("Successfully withdrawn " + moneyToWithdraw + " kr.");
                    }
                    else {
                        messageLabel.setText("Not enough cash.");
                    }
                }
                catch (Exception ex) {
                    messageLabel.setText("Please only withdraw numbers.");
                }
            }
        });
    }

    public void fromExercise8(Exercise8User user) {
        this.user = user;
        currentMoneyLabel.setText("Current balance: " + user.getBalance());
    }
}

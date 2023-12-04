package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    MyFrame() {

        ImageIcon icon = new ImageIcon("heart.png");

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(e -> System.out.println("Hej"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.pink);
        button.setBackground(Color.white);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Hej");
        }
    }
}

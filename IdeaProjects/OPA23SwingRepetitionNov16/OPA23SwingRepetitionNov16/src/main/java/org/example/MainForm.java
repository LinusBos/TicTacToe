package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JButton toExercise2Button;
    private JButton toExercise3Button;
    private JButton toExercise4Button;
    private JButton toExercise5Button;
    private JButton toExercise6Button;
    private JButton toExercise7Button;
    private JButton toExercise8Button;
    private JButton toExercise9Button;
    private JButton toExercise10Button;
    private JPanel mainFormPanel;

    private Form mainFrame;

    public MainForm() {
        mainFrame = new Form(mainFormPanel, "Main Form", JFrame.EXIT_ON_CLOSE);

        toExercise2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Exercise2 exercise2 = new Exercise2();
            }
        });
        toExercise3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise3 exercise3 = new Exercise3();
            }
        });
        toExercise4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise4 exercise4 = new Exercise4();
            }
        });
        toExercise5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise5 exercise5 = new Exercise5();
            }
        });
        toExercise6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise6 exercise6 = new Exercise6();
            }
        });
        toExercise7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise7 exercise7 = new Exercise7();
            }
        });
        toExercise8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise8 exercise8 = new Exercise8();
            }
        });
        toExercise9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise9 exercise9 = new Exercise9();
            }
        });
        toExercise10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exercise10 exercise10 = new Exercise10();
            }
        });
    }
}

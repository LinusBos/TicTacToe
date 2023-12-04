package org.example;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

                ImageIcon image = new ImageIcon("org/example/Hero Pedigree Cats.jpg");
                Border border = BorderFactory.createLineBorder(Color.green);

                JLabel label = new JLabel();
                label.setText("Simon, Diana och Silver");
                label.setIcon(image);
                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.TOP);
                label.setForeground(Color.yellow);
                label.setFont(new Font("MV Boli", Font.PLAIN, 20));
                label.setIconTextGap(-25);
                label.setBackground(Color.magenta);
                label.setOpaque(true);
                label.setBorder((border));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBounds(100, 100, 250, 250);

                JFrame frame = new JFrame();
                frame.setTitle("JFrame title goes here");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(null);
                frame.setSize(500, 500);
                frame.setVisible(true);

            }
}
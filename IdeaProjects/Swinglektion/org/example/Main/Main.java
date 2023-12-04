
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Hero Pedigree Cats.jpg");

        JLabel label = new JLabel();
        label.setText("Simon, Diana och Silver");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.add(label);

        frame.getContentPane().setBackground(Color.pink);

    }
}

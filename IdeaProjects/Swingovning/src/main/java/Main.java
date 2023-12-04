import javax.swing.*;

public class Main extends JFrame {
    private JLabel jlFirstName;
    private JTextField textField1;
    private JButton button1;

    public Main () {
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}

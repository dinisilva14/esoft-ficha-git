import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame{
    private JPanel panel1;
    private JLabel lblMensagem;

    public HelloWorld(String helloWorld) {
        super(helloWorld);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
    }


    public static void main(String[] args) {
        new HelloWorld("HelloWorld").setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo extends JFrame implements ActionListener {

    JButton a, b;
    JLabel l;

    public ButtonEventDemo() {

        setTitle("Swing Event Handling");

        a = new JButton("Alpha");
        b = new JButton("Beta");

        l = new JLabel("Click a button", JLabel.CENTER);

        setLayout(new FlowLayout());

        add(a);
        add(b);
        add(l);

        a.addActionListener(this);
        b.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            l.setText("Alpha Button Clicked");
        } else if (e.getSource() == b) {
            l.setText("Beta Button Clicked");
        }
    }

    public static void main(String[] args) {
        new ButtonEventDemo();
    }
}

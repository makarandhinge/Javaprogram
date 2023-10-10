import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ExAddition extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b;

    ExAddition() {
        setSize(500, 500);
        setVisible(true);
        setTitle("ADDITION");
        setLayout(null);
        t1 = new JTextField();
        t1.setBounds(30, 60, 100, 30);
        t2 = new JTextField();
        t2.setBounds(30, 120, 100, 30);
        t3 = new JTextField();
        t3.setBounds(30, 150, 100, 30);
        b = new JButton("ADD");
        b.setBounds(30, 200, 100, 30);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        t3.setText("" + c);

    }

    public static void main(String[] args) {
        ExAddition a = new ExAddition();
    }

}

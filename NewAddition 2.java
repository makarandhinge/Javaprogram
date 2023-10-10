import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewAddition extends JFrame implements ActionListener {
    JTextField t1,t2,t3;

    public NewAddition()
    {

        JTextField t1 = new JTextField(30);
        JTextField t2 = new JTextField(30);
        JButton bt = new JButton("Add");
        JTextField t3 = new JTextField(30);

        add(t1);
        add(t2);
        add(bt);
        add(t3);

        bt.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        t3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        NewAddition na = new NewAddition();
    }
    
}

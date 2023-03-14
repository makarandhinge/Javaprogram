

import javax.swing.*;
import java.awt.*;

class Demo
{
    public static void main(String[] args) {
        JFrame a = new JFrame("Login Page");
        a.setVisible(true);
        a.setSize(250,300);
        a.setLayout(new FlowLayout());
        JLabel b = new JLabel("Username");
        a.add(b);
        JTextField c = new JTextField(20);
        a.add(c);
        JLabel d = new JLabel("Password");
        a.add(d);
        JPasswordField e = new JPasswordField(20);
        a.add(e);
        JButton f = new JButton("Submit");
        a.add(f);
        
        
    
    
    }
}
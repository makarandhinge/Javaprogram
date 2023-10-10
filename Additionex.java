import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Additionex extends Applet implements ActionListener {
    TextField t1, t2, t3;
    Button bt;

    public void init() {

        t1 = new TextField();
        t1.setBounds(30, 60, 100, 30);
        t2 = new TextField();
        t2.setBounds(30, 120, 100, 30);
        t3 = new TextField();
        t3.setBounds(30, 150, 100, 30);
        bt = new Button("ADD");
        bt.setBounds(30, 200, 100, 30);
        add(t1);
        add(t2);
        add(t3);
        add(bt);
        bt.addActionListener(this);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        t3.setText(" " + c);

    }

}

/*
 * <applet code="Additionex" width=250 height=250>
 * </applet>
 */
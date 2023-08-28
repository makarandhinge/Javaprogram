import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Listenerex extends Frame implements ActionListener{
    
  
    

     Listener()
     {
        GridLayout gt = new GridLayout(3,2);
        Label l = new Label("First Number");
        add(l);
        TextField t = new TextField();
        add(t);
        Label l1 = new Label("Second Number");
        add(l1);
        TextField t1 = new TextField();
        add(t1);
        Button bt = new Button("Add");
        setLayout(gt);
        bt.addActionListener(bt);

     }

     public void Actionperformed(ActionEvent ae)
     {
        int a = Interger.parsInt(t1.getText());
        int b = Interger.parsInt(t2.getText());
        int c = a+b;

        t3.setText(" " +c);
     }


}

import java.awt.*;
import java.awt.event.ActionListener;



import javafx.event.ActionEvent;

 class ActionListenerex extends Frame implements ActionListener{
    TextField t1,t2,t3;
    Button bt;
    public ActionListenerex()
    {
        
        

        t1 = new TextField();
        t1.setBounds(10,50,70,30);
        t2 = new TextField();
        t2.setBounds(10,100,70,30);
        t3 = new TextField();
        t3.setBounds(10,200,70,30);
        bt = new Button("Add");
        bt.setBounds(10,300,70,30);
        add(t1);
        add(t2);
        add(t3);
        add(bt);

        bt.addActionListener(this);
        setSize(250,250);
        setVisible(true);
        setTitle("First Action Listener Program");
        

    }

    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;

        t3.setText(" " +c);
    }
    
    public static void main(String[] args) {
        ActionListenerex al = new ActionListenerex();
    }
}

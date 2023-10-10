import java.awt.*;
import java.awt.event.*;

class Itemex extends Frame implements ItemListener {
    List l1;
    Label l2;

    Itemex() {
        setSize(500, 500);
        setVisible(true);
        setTitle("Item Listener Example");
        setLayout(null);

        l1 = new List();
        l1.setBounds(30, 60, 100, 80);
        l1.addItem("CSE");
        l1.addItem("AIDS");
        l1.addItem("CIVIL");
l1.addItem("ELECTRICAL");
        add(l1);

        l2 = new Label();
        l2.setBounds(150, 60, 200, 30);
        add(l2);

        l1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
 {
        l2.setText(l1.getSelectedItem());
    }

    public static void main(String[] args) {
        Itemex m = new Itemex();
    }
}

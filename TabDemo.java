
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

class Panel01 extends JPanel {
    Panel01() {

        DefaultMutableTreeNode country = new DefaultMutableTreeNode();
        DefaultMutableTreeNode India = new DefaultMutableTreeNode("India");
        country.add(India);
        DefaultMutableTreeNode USA = new DefaultMutableTreeNode("USA");
        country.add(USA);
        DefaultMutableTreeNode Maha = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode TM = new DefaultMutableTreeNode("Tamil Nadu");
        DefaultMutableTreeNode G = new DefaultMutableTreeNode("Gujarat");
        DefaultMutableTreeNode H = new DefaultMutableTreeNode("Haryana");
        DefaultMutableTreeNode K = new DefaultMutableTreeNode("Karnataka");
        DefaultMutableTreeNode Goa = new DefaultMutableTreeNode("Goa");
        India.add(Maha);
        India.add(TM);
        India.add(G);
        India.add(H);
        India.add(K);
        India.add(Goa);
        DefaultMutableTreeNode kol = new DefaultMutableTreeNode("Kolhapur");
        DefaultMutableTreeNode Sangli = new DefaultMutableTreeNode("Sangli");
        DefaultMutableTreeNode Satar = new DefaultMutableTreeNode("Satar");
        Maha.add(kol);
        Maha.add(Sangli);
        Maha.add(Satar);
        DefaultMutableTreeNode Kag = new DefaultMutableTreeNode("Kagal");
        DefaultMutableTreeNode Kar = new DefaultMutableTreeNode("Karvir");
        DefaultMutableTreeNode Ich = new DefaultMutableTreeNode("Ichalkaranji");
        kol.add(Kag);
        kol.add(Kar);
        kol.add(Ich);
        DefaultMutableTreeNode yal = new DefaultMutableTreeNode("Yalgud");
        DefaultMutableTreeNode p = new DefaultMutableTreeNode("Pimpalgaon");
        DefaultMutableTreeNode m = new DefaultMutableTreeNode("Mouje");
        DefaultMutableTreeNode k = new DefaultMutableTreeNode("Kasaba");
        Kag.add(yal);
        Kag.add(p);
        Kag.add(m);
        Kag.add(k);
        JTree jt = new JTree(country);
        add(jt);

    }
}

class Panel02 extends JPanel {
    Panel02() {
        GridLayout g1 = new GridLayout(3, 2);
        JLabel l = new JLabel("Username");
        add(l);
        JTextField t = new JTextField();
        add(t);
        JLabel l3 = new JLabel("Password");
        add(l3);
        JPasswordField t3 = new JPasswordField();
        add(t3);
        JButton b = new JButton("Login");
        add(b);
        JButton b1 = new JButton("Clear");
        add(b1);
        setLayout(g1);
        t3.setToolTipText("Enter your Password");
        t.setToolTipText("Enter your Username");

    }
}

class Panel03 extends JPanel {
    Panel03() {
        String h[] = { "Rollno", "Name" };
        String d[][] = { { "1", "Makarand" }, { "2", "Adarsh" }, { "3", "Harsh" }, { "4", "Shrenik" },
                { "5", "Sajjad" } };
        JTable jt = new JTable(d, h);
        JScrollPane js = new JScrollPane(jt);
        add(js);

    }
}

class TabDemo extends JFrame {
    TabDemo() {
        JTabbedPane tb = new JTabbedPane();
        tb.addTab("JTree", new Panel01());
        add(tb);
        tb.addTab("ToolTip", new Panel02());
        tb.addTab("JTable", new Panel03());
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        TabDemo td = new TabDemo();

    }
}
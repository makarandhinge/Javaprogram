import java.awt.*;


class Gridex extends Frame
{
Gridex()
{
setSize(400,400);
setVisible(true);
setLocation(500,200);
setTitle("GridLayout");
GridLayout g1 = new GridLayout(5,5);

Label l = new Label("Name");
add(l);
TextField t = new TextField();
add(t);
Label l3 = new Label("Email");
add(l3);
TextField t3 = new TextField();
add(t3);
Label l2= new Label("Username");
add(l2);
TextField t2= new TextField();
add(t2);
Label l1 = new Label("password");
add(l1);
TextField t1 = new TextField();
add(t1);
t1.setEchoChar('#');
Button b = new Button("Login");
add(b);
Button b1 = new Button("Clear");
add(b1);
setLayout(g1);
}
public static void main(String[] args)
{
Gridex q = new Gridex();
}
}
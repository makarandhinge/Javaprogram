import java.awt.*;

class Name1 extends Frame
{
Name1()
{
setTitle("Welcome");
setSize(800,400);
setLocation(500,200);
setVisible(true);
setLayout(null);

Label l = new Label("Name --");
l.setBounds(30,100,80,30);
add(l);
TextField t = new TextField();
t.setBounds(50,100,150,30);
add(t);

Label l1 = new Label("Address --");
l1.setBounds(30,150,80,30);
add(l1);
TextArea t1 = new TextArea();
t1.setBounds(50,150,150,30);
add(t1);

Label l2 = new Label("Gender --");
l2.setBounds(30,200,80,30);
add(l2);
CheckboxGroup c2 = new CheckboxGroup();
Checkbox c = new Checkbox("Male",c2,true);
c.setBounds(150,200,150,30);
add(c);
Checkbox c1 = new Checkbox("Female",c2,false);
c1.setBounds(300,200,150,30);
add(c1);

Label l3 = new Label("Hobbies --");
l3.setBounds(30,250,80,30);
add(l3);
Checkbox c4 = new Checkbox("Swimming");
c4.setBounds(150,250,150,30);
add(c4);
Checkbox c3 = new Checkbox("Reading");
c3.setBounds(300,250,150,30);
add(c3);
Checkbox c5 = new Checkbox("Drawing");
c5.setBounds(450,250,150,30);
add(c5);
Checkbox c6 = new Checkbox("Driving");
c6.setBounds(600,250,150,30);
add(c6);

Label l4 = new Label("Department --");
l4.setBounds(30,300,80,30);
add(l4);
Choice m = new Choice();
m.setBounds(100,300,80,30);
m.add("CSE");
m.add("AI");
m.add("MECH");
m.add("CIVIL");
m.add("ENTC");
m.add("ELECRIC");
add(m);

Button b = new Button("Submit");
b.setBounds(30,350,80,30);
add(b);
Button b1 = new Button("Clear");
b.setBounds(100,350,80,30);
add(b1);



}
public static void main(String[] args)
{
Name1 f = new Name1();
}
}
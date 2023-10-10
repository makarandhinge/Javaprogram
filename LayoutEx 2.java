import java.awt.*;

class LayoutEx extends Frame
{
LayoutEx()
{
setSize(400,400);
setVisible(true);
setLocation(500,200);
setTitle("Layout");
BorderLayout b = new BorderLayout(20,20);
Button b1 = new Button("NORTH");
add(b1,b.NORTH);

Button b2 = new Button("WEST");
add(b2,b.WEST);

Button b3 = new Button("EAST");
add(b3,b.EAST);

Button b4 = new Button("SOUTH");
add(b4,b.SOUTH);

Label l = new Label("CENTER",Label.CENTER);
add(l,b.CENTER);
}


public static void main(String[] args)
{
LayoutEx m = new LayoutEx();
}
}
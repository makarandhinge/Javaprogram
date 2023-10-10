import java.awt.*;

class Gridlayoutex extends Frame
{
Gridlayoutex()
{
setSize(400,400);
setVisible(true);
setLocation(500,200);
setTitle("Grid Layout");
GridLayout gl = new GridLayout(3,2);
Label l = new Label("NNN");
add(l);

TextField t = new TextField();
add(t);
setLayout(gl);
}


public static void main(String[] args)
{
Gridlayoutex m = new Gridlayoutex();
}
}
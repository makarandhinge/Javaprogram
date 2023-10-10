import java.awt.*;

class MenuBarEx extends Frame
{
MenuBarEx()
{
setSize(400,400);
setLayout(null);
setVisible(true);
setLocation(500,200);
MenuBar b = new MenuBar();

Menu m1 = new Menu("File");
MenuItem i = new MenuItem("New");
MenuItem i1 = new MenuItem("Open");
MenuItem i2 = new MenuItem("Save");
MenuItem i3 = new MenuItem("Exit");
m1.add(i);
m1.add(i1);
m1.add(i2);
m1.add(i3);
b.add(m1);

Menu m2 = new Menu("Edit");
MenuItem j = new MenuItem("Undo");
MenuItem j1 = new MenuItem("Cut");
MenuItem j2 = new MenuItem("Copy");
MenuItem j3 = new MenuItem("Paste");
m2.add(j);
m2.add(j1);
m2.add(j2);
m2.add(j3);
b.add(m2);

Menu m3 = new Menu("View");
Menu k = new Menu("Zoom");
MenuItem l = new MenuItem("Zoom in");
MenuItem l1 = new MenuItem("Zoom out");
MenuItem k2 = new MenuItem("Status Bar");
MenuItem k3 = new MenuItem("Word Wrap");
k.add(l);
k.add(l1);
m3.add(k);
m3.add(k2);
m3.add(k3);
b.add(m3);

setMenuBar(b);

}

public static void main(String[] args)
{
MenuBarEx m = new MenuBarEx();
}
}
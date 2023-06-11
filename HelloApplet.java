import java.applet.*;
import java.awt.*;

/*
 * <applet code="HelloApplet" width=300 height=300>
 * </applet>
 */

public class HelloApplet extends Applet{
    public void paint(Graphics g)
    {
        g.drawString("Welcome to Applet Tutorial",100,100);
    }
}

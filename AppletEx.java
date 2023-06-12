import java.applet.*;
import java.awt.*;

/*
     * <applet code="AppletEx" width=400 height=200>
     * <param name="Name"  value="sit">
     * </applet>
     *
     */

public class AppletEx extends Applet {

    String nm;
    public void init()
    {
        nm = getParameter("AppletEx");
    }
    public void paint(Graphics g)
    {
    g.drawString("Reading parameters passed to this applet -", 20, 20);

    g.drawString("Name -"  + nm, 20, 40);

    }

}





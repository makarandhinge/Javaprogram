import java.awt.*;
import java.applet.*;

    /*
     * <applet code=ListDemo width=300 height=300>
     * </applet>
     */

public class ListDemo extends Applet {
    public void init()
    {
        List l = new List();
        l.add("MH");
        l.add("KA");
        l.add("JK");
        l.add("TN");
        List l1 = new List(3,true);
        l1.add("AP");
        l1.add("MP");
        l1.add("UP");
        l1.add("HP");
        l1.add("D");
        add(l);
        add(l1);
    }
    
    
}

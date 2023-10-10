import java.awt.*;
import java.applet.*;

public class ChoiceDemo extends Applet {
    public void init()
    {
        Choice ch = new Choice();
        ch.add("CSE");
        ch.add("AIDS");
        ch.add("ENTC");
        add(ch);
    }
   
    
}
    /*
     * <applet code=ChoiceDemo width=300 height=300>
     * </applet>
     */
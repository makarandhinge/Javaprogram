import java.awt.*;
import java.applet.*;

public class TextFieldDemo extends Applet {

    public void init()
    {
        TextField t1 = new TextField();
        TextField t2 = new TextField("Name");
        TextField t3 = new TextField(25);
        TextField t4 = new TextField("Demo",25);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
    }
    
}
/*
 * 
 * <applet code=TextFieldDemo width=300 height=300>
 * </applet>
 */

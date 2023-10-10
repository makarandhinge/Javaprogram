import java.awt.*;
import java.applet.*;

public class TextAreaDemo extends Applet{

    public void init()
    {
        TextArea t = new TextArea();
        TextArea t1 = new TextArea("Address");
        TextArea t2 = new TextArea(5,25);
        TextArea t3 = new TextArea("Name",5,25);
        TextArea t4 = new TextArea("LastName",10,25,TextArea.SCROLLBARS_BOTH);
        add(t);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        
    }
    
}
/*
 * 
 * <applet code=TextAreaDemo width=500 height=500>
 * </applet>
 */
import java.awt.*;
import java.applet.*;

public class LabelDemo extends Applet {
    
    public void init(){

    Label l1 = new Label();
    Label l2 = new Label("Hello World");
    Label l3 = new Label("Enter Here",Label.RIGHT);
    add(l1);
    add(l2);
    add(l3);
    
}

/*
 * <applet code="LabelDemo" width=300 height=300>
 * </applet>
 * 
 */

}


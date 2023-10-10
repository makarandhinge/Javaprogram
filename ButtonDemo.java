import java.awt.*;
import java.applet.*;

public class ButtonDemo extends Applet {

    public void init(){

        Button bt = new Button();
        add(bt);
        Button bt2 = new Button("Save");
        add(bt2);
    }
    /*
     * <applet code="ButtonDemo" width=300 height=300>
     * </applet>
     * 
     */
}

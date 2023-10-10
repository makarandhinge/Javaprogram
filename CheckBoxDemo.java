import java.awt.Checkbox;

import java.applet.*;

public class CheckBoxDemo extends Applet {
    
    public void init()
    {
        CheckBox ch1 = new CheckBox();
        CheckBox ch2 = new CheckBox("First CheckBox");
        CheckBox ch3 = new CheckBox("Second CheckBox",true);
        add(ch1);
        add(ch2);
        add(ch3);

    }
    /*
    * <applet code="CheckBoxDemo" width=300 height=300>
     * </applet>
    * 
     */

}

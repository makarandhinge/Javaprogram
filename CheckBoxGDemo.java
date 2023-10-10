import java.awt.Checkbox;

import java.applet.*;

public class CheckBoxGDemo extends Applet {
    
    public void init()
    {
        CheckBoxGroup chg = new CheckBoxGDemo();
        CheckBox ch1 = new CheckBox();
        CheckBox ch2 = new CheckBox("First CheckBox");
        CheckBox ch3 = new CheckBox("Second CheckBox",true);
        CheckBox ch4 = new CheckBox("Third CheckBox",true,chg);
        CheckBox ch5 = new CheckBox("Fourth CheckBox",false,chg);
        
        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
        add(ch5);

    }
   

}
    /*
    * <applet code="CheckBoxGDemo" width=300 height=300>
     * </applet>
    * 
    */

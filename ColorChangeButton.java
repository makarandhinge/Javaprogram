import java.awt.*;

import javax.swing.JFrame;




public class ColorChangeButton extends JFrame {

    Button btgreen,btblue,btred;

    ColorChangeButton(){
    setTitle("Color Change Using Button");
    setSize(300, 200);
    setLayout(new BorderLayout());


    btred = new Button("Red");
    btgreen = new Button("Green");
    btblue = new Button("Blue");

    }

}

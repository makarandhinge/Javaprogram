import java.awt.*;

public class DialogDemo extends Dialog {
    
    DialogDemo()
    {
        Frame f = new Frame();
        Dialog d = new Dialog(f,"Simple Window",true);
        d.setLayout(new FlowLayout());
        Button bt = new Button("Save");
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
        add(f);
        f.setSize(500,500);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        DialogDemo d11 = new DialogDemo();

    }
}

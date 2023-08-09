import java.awt.*;

public class GridBag extends Frame{

    GridBag()
    {
        setSize(400,400);
    setVisible(true);
    setLocation(500,200);
    setTitle("GridBagLayout");
        GridBagLayout gl = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        setLayout(gl);
        GridBagLayout gl2 = new GridBagLayout();
        this.setLayout(gl2);
        gc.gridx=0;
        gc.gridy=0;
        Button b = new Button("Button1");
        add(b,gc);
        gc.gridx=1;
        gc.gridy=0;
        Button b1 = new Button("Button2");
        add(b1,gc);
        gc.gridx=0;
        gc.gridy=1;
        Button b2 = new Button("Button3");
        add(b2,gc);
        gc.gridx=1;
        gc.gridy=1;
        Button b3 = new Button("Button4");
        add(b3,gc);


    }
    public static void main(String[] args) {
        GridBag g = new GridBag();
    }
    
}

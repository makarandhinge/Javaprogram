import javax.swing.*;
import java.awt.*;

public class Id extends JFrame{

    Id()
    {
        Container ct = getContentPane();
    }
    public static void main(String[] args) {
        Id i = new Id();
        i.setSize(500,300);
        i.setVisible(true);
        i.setTitle("College Id");
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

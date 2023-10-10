import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Mouseex extends Frame implements MouseListener {
    Mouseex() {
        setSize(500, 500);
        setVisible(true);
        setTitle("Color Change using mouse");
        setLayout(null);

        addMouseListener(this);

    }

    public void mouseClicked(MouseEvent me) {

    }

    public void mousePressed(MouseEvent me) {
        this.setBackground(Color.PINK);

    }

    public void mouseReleased(MouseEvent me) {
        this.setBackground(Color.RED);

    }

    public void mouseEntered(MouseEvent me) {
        this.setBackground(Color.BLUE);

    }

    public void mouseExited(MouseEvent me) {
        this.setBackground(Color.GREEN);

    }

    public static void main(String[] args) {
        Mouseex m = new Mouseex();
    }
}

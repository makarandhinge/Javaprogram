import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;

public class Keyboardex extends Frame implements KeyListener {
    TextField t1;
    Label l1;

    Keyboardex() {
        setSize(500, 500);
        setVisible(true);
        setTitle("Keyboard");
        setLayout(null);

        t1 = new TextField();
        t1.setBounds(30, 60, 100, 30);
        l1 = new Label();
        l1.setBounds(150, 60, 200, 30);
        add(t1);
        add(l1);
        t1.addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        l1.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent ke) {
        l1.setText("Key Released");
    }

    public void keyTyped(KeyEvent ke) {
        l1.setText("Key Typed");
    }

    public static void main(String[] args) {
        Keyboardex k = new Keyboardex();
    }

}

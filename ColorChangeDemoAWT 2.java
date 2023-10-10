import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeDemoAWT extends Frame {

    private Button redButton, greenButton, blueButton;
    private Panel colorPanel;

    public ColorChangeDemoAWT() {
        setTitle("Color Change Demo");
        setSize(300, 200);
        setLayout(new BorderLayout());

        colorPanel = new Panel();
        colorPanel.setBackground(Color.WHITE);

        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");

        redButton.addActionListener(new ColorButtonListener(Color.RED));
        greenButton.addActionListener(new ColorButtonListener(Color.GREEN));
        blueButton.addActionListener(new ColorButtonListener(Color.BLUE));

        Panel buttonPanel = new Panel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        add(colorPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class ColorButtonListener implements ActionListener {
        private Color color;

        public ColorButtonListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new ColorChangeDemoAWT());
    }
}

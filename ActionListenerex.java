import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerEx extends Frame implements ActionListener {

    Button addButton;
    TextField numField1, numField2;
    Label resultLabel;

    public ActionListenerEx() {
        setTitle("ActionListener Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        numField1 = new TextField(10);
        numField2 = new TextField(10);
        addButton = new Button("Add");
        resultLabel = new Label("Result: ");

        addButton.addActionListener(this); // Register the current class as ActionListener

        add(new Label("Enter two numbers: "));
        add(numField1);
        add(numField2);
        add(addButton);
        add(resultLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int result = num1 + num2;
            resultLabel.setText("Result: " + result);
       
    }

    public static void main(String[] args) {
        ActionListenerEx al = new ActionListenerEx();
    }
}

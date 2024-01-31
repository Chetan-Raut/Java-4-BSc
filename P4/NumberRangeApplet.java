import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class NumberRangeApplet extends Applet implements ActionListener {
    TextField numField1, numField2;
    Button displayButton;
    TextArea resultArea;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Create input fields and button
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        displayButton = new Button("Display Numbers");

        // Create result area
        resultArea = new TextArea(10, 20);
        resultArea.setEditable(false);

        // Add components to the applet
        add(new Label("Enter first number:"));
        add(numField1);
        add(new Label("Enter second number:"));
        add(numField2);
        add(displayButton);
        add(resultArea);

        // Add action listener to the button
        displayButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displayButton) {
            // Get numbers from text fields
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());

            // Clear previous results
            resultArea.setText("");

            // Display numbers between num1 and num2
            for (int i = Math.min(num1, num2) + 1; i < Math.max(num1, num2); i++) {
                resultArea.append(i + "\n");
            }
        }
    }
}
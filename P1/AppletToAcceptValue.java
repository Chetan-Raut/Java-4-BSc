import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ValueApplet extends Applet implements ActionListener {
    Button inputButton;
    TextField displayField;

    public void init() {
        // Create a button for user input
        inputButton = new Button("Input Value");
        inputButton.addActionListener(this);
        add(inputButton);

        // Create a text field to display the value
        displayField = new TextField(10);
        add(displayField);

        // Set the layout of the applet
        setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent e) {
        // Show input dialog to get value from user
        String userInput = JOptionPane.showInputDialog("Enter a value:");

        // Display the value in the text field
        displayField.setText(userInput);
    }
}
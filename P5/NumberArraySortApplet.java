import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberArraySortApplet extends JApplet implements ActionListener {
    JTextField[] numberFields;
    JButton sortButton;
    JTextArea resultArea;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Create array of text fields for numbers
        numberFields = new JTextField[10];
        for (int i = 0; i < 10; i++) {
            numberFields[i] = new JTextField(5);
            add(numberFields[i]);
        }

        // Create button to trigger sorting
        sortButton = new JButton("Sort");
        add(sortButton);
        sortButton.addActionListener(this);

        // Create text area to display sorted array
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sortButton) {
            // Create array to store numbers
            int[] numbers = new int[10];

            // Read numbers from text fields and store in the array
            for (int i = 0; i < 10; i++) {
                try {
                    numbers[i] = Integer.parseInt(numberFields[i].getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input in text field " + (i + 1), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Sort the array
            sortArray(numbers);

            // Display sorted array in text area
            resultArea.setText("Sorted Array:\n");
            for (int number : numbers) {
                resultArea.append(number + "\n");
            }
        }
    }

    // Method to sort the array
    private void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        // Create an array to store the values
        double[] values = new double[n];

        // Accept values from the user
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }

        // Display the values
        System.out.println("\nEntered values:");
        for (int i = 0; i < n; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
        }

        // Calculate the average
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        double average = sum / n;

        // Display the average
        System.out.println("\nAverage: " + average);

        scanner.close();
    }
}
public class MultiplicationTable {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
            System.out.println(); // Add a blank line to separate tables
        }
    }
}

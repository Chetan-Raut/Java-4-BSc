import java.util.Arrays;
import java.util.Scanner;

public class StringSorterConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert string to character array
        char[] charArray = inputString.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert sorted character array back to string
        String sortedString = new String(charArray);

        // Display the sorted string
        System.out.println("Sorted string: " + sortedString);

        scanner.close();
    }
}
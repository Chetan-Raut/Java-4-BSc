import java.util.*;

public class MultipleSelectionListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create items for the list
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        // Display items to the user
        System.out.println("Select multiple items from the list:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }

        // Get user selection
        System.out.println("Enter the numbers of the items you want to select (separated by spaces):");
        String input = scanner.nextLine();
        String[] selectedIndexes = input.split(" ");

        // Display selected items
        System.out.println("Selected Items:");
        for (String index : selectedIndexes) {
            int i = Integer.parseInt(index.trim()) - 1; // Adjust index to 0-based
            if (i >= 0 && i < items.length) {
                System.out.println(items[i]);
            }
        }

        scanner.close();
    }
}
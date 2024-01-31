public class ConstructorOverloadingDemo {
    private int value;

    // Default constructor
    public ConstructorOverloadingDemo() {
        value = 0;
    }

    // Parameterized constructor with one parameter
    public ConstructorOverloadingDemo(int v) {
        value = v;
    }

    // Parameterized constructor with two parameters
    public ConstructorOverloadingDemo(int v1, int v2) {
        value = v1 + v2;
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo(5);
        ConstructorOverloadingDemo obj3 = new ConstructorOverloadingDemo(3, 7);

        // Displaying values
        obj1.displayValue(); // Value: 0
        obj2.displayValue(); // Value: 5
        obj3.displayValue(); // Value: 10
    }
}
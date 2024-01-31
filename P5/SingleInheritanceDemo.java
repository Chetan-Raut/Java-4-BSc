// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog dog = new Dog();

        // Access methods from both parent and child classes
        dog.eat();  // Method from parent class
        dog.bark(); // Method from child class
    }
}
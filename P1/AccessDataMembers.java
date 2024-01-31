// Create a class named Student
class Student {
    int studentID; // Data member to store student ID
    String studentName; // Data member to store student name
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student studentObject = new Student();

        // Access and set data members of the Student object
        studentObject.studentID = 101;
        studentObject.studentName = "Chetan Raut";

        // Access and print the data members
        System.out.println("Student ID: " + studentObject.studentID);
        System.out.println("Student Name: " + studentObject.studentName);
    }
}
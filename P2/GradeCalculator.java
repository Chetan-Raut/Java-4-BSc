import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");

        double totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + " marks: ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate total and percentage
        double totalSubjects = 5;
        double percentage = (totalMarks / (totalSubjects * 100)) * 100;

        // Display total and percentage
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
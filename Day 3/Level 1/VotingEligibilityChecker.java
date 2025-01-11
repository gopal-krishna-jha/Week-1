
import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Loop to check the voting eligibility of each student
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];

            if (age < 0) {
                // If the age is a negative number, print an invalid age message
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                // If the age is 18 or above, the student can vote
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                // If the age is less than 18, the student cannot vote
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}




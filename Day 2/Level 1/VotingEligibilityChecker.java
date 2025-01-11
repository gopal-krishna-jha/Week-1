import java.util.Scanner;

// Creating a class named VotingEligibilityChecker 
public class VotingEligibilityChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Check if the age is 18 or older
        if (age >= 18) {
            // Output the result if the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Output the result if the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
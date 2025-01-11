import java.util.Scanner;

// Creating a class named NumberChecker
public class NumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // Output if the number is positive
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            // Output if the number is negative
            System.out.println("The number " + number + " is negative.");
        } else {
            // Output if the number is zero
            System.out.println("The number " + number + " is zero.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
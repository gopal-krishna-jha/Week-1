import java.util.Scanner;

// Creating a class named FactorialCalculator
public class FactorialCalculatorr {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize the factorial variable to 1
        int factorial = 1;

        // Check if the user has entered a positive integer
        if (number >= 0) {
            // Using a for loop to compute the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output the factorial result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            // Output if the number is not a positive integer
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
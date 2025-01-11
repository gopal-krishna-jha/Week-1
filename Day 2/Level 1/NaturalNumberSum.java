import java.util.Scanner;

// Creating a class named NaturalNumberSum 
public class NaturalNumberSum {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Calculate the sum of n natural numbers using the formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Output the result if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner object
        scanner.close();
    }
}

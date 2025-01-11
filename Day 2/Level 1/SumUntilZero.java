import java.util.Scanner;

// Creating a class named SumUntilZero
public class SumUntilZero {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize the total variable to 0.0
        double total = 0.0;

        // Create a variable to store the double value the user enters
        double userInput;

        // Use a while loop to continuously ask for input and add to the total
        do {
            // Prompt the user to enter a number
            System.out.print("Enter a number (0 to stop): ");
            userInput = scanner.nextDouble();

            // Add the user input to the total if it's not 0
            if (userInput != 0) {
                total += userInput;
            }
        } while (userInput != 0);

        // Output the total value
        System.out.println("The total sum is " + total);

        // Close the Scanner object
        scanner.close();
    }
}

import java.util.Scanner;

// Creating a class named NumberSwapper
public class NumberSwapper {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Display the original numbers
        System.out.println("Original numbers are: " + number1 + " and " + number2);

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped numbers
        System.out.println("The swapped numbers are: " + number1 + " and " + number2);

        // Close the Scanner object
        scanner.close();
    }
}

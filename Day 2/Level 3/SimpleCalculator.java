
import java.util.Scanner;

// Creating a class named SimpleCalculator
public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        // Prompt the user to enter the operator (+, -, *, /)
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = scanner.next();

        // Variable to store the result
        double result = 0;

        // Using switch...case to perform operations based on the operator
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                // Handle invalid operators
                System.out.println("Invalid operator.");
                return;
        }

        // Output the result
        System.out.println("The result of " + first + " " + op + " " + second + " is " + result);

        // Close the Scanner object
        scanner.close();
    }
}

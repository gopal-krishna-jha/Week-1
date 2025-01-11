import java.util.Scanner;

// Creating a class named QuotientRemainderCalculator
public class QuotientRemainderCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " 
                            + remainder + " of two numbers " + number1 + " and " + number2);

        // Close the Scanner object
        scanner.close();
    }
}


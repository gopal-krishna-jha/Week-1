import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get integer input for the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get integer input for the power variable
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Create a result variable with initial value of 1
        int result = 1;

        // Run a for loop from i = 1 to i <= power
        for (int i = 1; i <= power; i++) {
            // Multiply the result with the number and assign the value to result
            result *= number;
        }

        // Finally, print the result
        System.out.println(number + " to the power of " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

// Creating a class named DivisibilityChecker
public class DivisibilityChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Output the result according to the specified format
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the Scanner object
        scanner.close();
    }
}

import java.util.Scanner;

// Creating a class named SmallestNumberChecker
public class SmallestNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Output the result according to the specified format
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the Scanner object
        scanner.close();
    }
}

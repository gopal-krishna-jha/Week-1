import java.util.Scanner;

// Creating a class named LargestNumberChecker 
public class LargestNumberChecker {

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

        // Check if the first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);

        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);

        // Check if the third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Output the results according to the specified format
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner object
        scanner.close();
    }
}

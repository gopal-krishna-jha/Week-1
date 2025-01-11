import java.util.Scanner;

public class OddEvenSeparator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the input is a natural number
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (positive integer).");
            return; // Exit the program
        }

        // Create integer arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Initialize index variables for even and odd numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Save even numbers into the evenNumbers array
                evenNumbers[evenIndex++] = i;
            } else {
                // Save odd numbers into the oddNumbers array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
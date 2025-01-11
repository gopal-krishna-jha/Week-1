import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get an integer input and store it in the variable number
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Define an integer array to store the multiplication results
        int[] multiplicationResults = new int[4]; // For 6, 7, 8, and 9

        // Using a for loop, find the multiplication table of numbers from 6 to 9 and
        // save the result in the array
        for (int i = 6; i <= 9; i++) {
            multiplicationResults[i - 6] = number * i; // Store the result in the array
        }

        // Display the result from the array in the format number * i = ___
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResults[i - 6]);
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
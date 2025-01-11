import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get an integer input and store it in the number variable
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Define an integer array to store the results of multiplication from 1 to 10
        int[] multiplicationTable = new int[10];

        // Run a loop from 1 to 10 and store the results in the multiplication table
        // array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i; // Store the result in the array
        }

        // Display the result from the array in the format number * i = ___
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}

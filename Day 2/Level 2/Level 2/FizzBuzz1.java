import java.util.Scanner;

public class FizzBuzz1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number > 0) {
            int i = 0;

            // Use a while loop to iterate from 0 to the number
            while (i <= number) {
                // Check if the number is a multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    // Check if the number is a multiple of 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    // Check if the number is a multiple of 5
                    System.out.println("Buzz");
                } else {
                    // Print the number
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner
        scanner.close();
    }
}

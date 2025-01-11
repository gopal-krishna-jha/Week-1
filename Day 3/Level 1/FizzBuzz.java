public import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get a positive integer input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number > 0) {
            // Create a String array to save the results
            String[] results = new String[number + 1];

            // Loop from 0 to the number and save the results based on the FizzBuzz rules
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz"; // Multiple of both 3 and 5
                } else if (i % 3 == 0) {
                    results[i] = "Fizz"; // Multiple of 3
                } else if (i % 5 == 0) {
                    results[i] = "Buzz"; // Multiple of 5
                } else {
                    results[i] = Integer.toString(i); // Other numbers
                }
            }

            // Display the results from the array in the specified format
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
 {
    
}

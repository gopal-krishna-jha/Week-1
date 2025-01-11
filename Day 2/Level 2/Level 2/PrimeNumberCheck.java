
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize isPrime boolean variable to true
        boolean isPrime = true;

        // Check for numbers greater than 1
        if (number > 1) {
            // Loop through all the numbers from 2 to the user input number
            for (int i = 2; i <= number / 2; i++) {
                // Check if the remainder is zero
                if (number % i == 0) {
                    // If remainder is zero, the number is not a prime number
                    isPrime = false;
                    break;
                }
            }
        } else {
            // Numbers less than or equal to 1 are not prime numbers
            isPrime = false;
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}

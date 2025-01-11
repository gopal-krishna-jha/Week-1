import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the input value for a variable named number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Run a for loop from i = 1 to i <= number
        for (int i = 1; i <= number; i++) {
            // Check if number is perfectly divisible by i
            if (number % i == 0) {
                // If true, print the value of i
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}

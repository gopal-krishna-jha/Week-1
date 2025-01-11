
import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get input value for a variable named number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Run a for loop backward: from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                // If true, print the number
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}


import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input and assign it to the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // Create a for loop that runs from last but one till 1 (i = number - 1 to i =
        // 1)
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // Assign i to greatestFactor variable and break the loop
                greatestFactor = i;
                break;
            }
        }

        // Display the greatestFactor variable outside the loop
        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        // Close the scanner
        scanner.close();
    }
}

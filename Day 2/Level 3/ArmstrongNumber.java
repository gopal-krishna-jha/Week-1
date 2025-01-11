import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input and store it in the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define sum variable, initialize it to zero
        int sum = 0;
        
        // Store the input number in originalNumber variable
        int originalNumber = number;

        // Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder number (last digit)
            int digit = originalNumber % 10;
            // Find the cube of the digit and add it to the sum variable
            sum += Math.pow(digit, 3);
            // Remove the last digit from originalNumber
            originalNumber /= 10;
        }

        // Check if the number and the sum are the same
        if (number == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        // Close the scanner
        scanner.close();
    }
}
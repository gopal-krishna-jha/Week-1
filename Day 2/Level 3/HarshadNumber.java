
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an integer variable sum with initial value 0
        int sum = 0;

        // Create a copy of the original number to work with
        int temp = number;

        // Create a while loop to access each digit of the number
        while (temp != 0) {
            // Add each digit of the number to sum
            sum += temp % 10;
            temp /= 10;
        }

        // Check if the number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        // Close the scanner
        scanner.close();
    }
}

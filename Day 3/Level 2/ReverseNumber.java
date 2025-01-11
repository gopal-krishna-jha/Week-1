import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Define the array to store the digits
        int[] digits = new int[digitCount];
        int index = 0;

        // Loop to extract digits from the number and store them in the array
        while (number != 0) {
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit from the number
            index++;
        }

        // Display the elements of the array in reverse order
        System.out.print("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        // Close the Scanner object to free up resources
        scanner.close();
    }
}

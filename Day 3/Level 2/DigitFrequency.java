import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the digits
        int[] digits = new int[10];
        int index = 0;

        // Loop to extract digits from the number and store them in the array
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            digits[index++] = digit; // Store the digit in the array
            number /= 10; // Remove the last digit from the number
        }

        // Define a frequency array to store the frequency of each digit
        int[] frequency = new int[10];

        // Loop through the digits array and increase the frequency of each digit
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
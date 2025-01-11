
import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define an array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take input for each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop to check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number > 0) {
                // If the number is positive, check if it is even or odd
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is positive and even.");
                } else {
                    System.out.println("The number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                // If the number is negative, print negative
                System.out.println("The number " + number + " is negative.");
            } else {
                // If the number is zero, print zero
                System.out.println("The number is zero.");
            }
        }

        // Compare the first and last elements of the array
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        if (firstNumber == lastNumber) {
            System.out.println("The first and last elements are equal.");
        } else if (firstNumber > lastNumber) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}

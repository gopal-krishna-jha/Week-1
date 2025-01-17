import java.util.*;

// Define a class ArrayIndexExceptionHandler to generate and handle ArrayIndexOutOfBoundsException
public class ArrayIndexExceptionHandler {

    // Method to generate the exception
    public static void generateException(int[] numbers) {
        // Attempt to access an index beyond the array length
        int invalidValue = numbers[numbers.length + 1];
    }

    // Method to handle the exception
    public void handleException(int[] numbers) {
        try {
            // Call the method generateException to deliberately cause the exception
            generateException(numbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print a descriptive message
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store values and take input from the user
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Instantiate the ArrayIndexExceptionHandler class
        ArrayIndexExceptionHandler exceptionHandler = new ArrayIndexExceptionHandler();

        // Call the method to handle the exception
        exceptionHandler.handleException(numbers);

        // Close the Scanner object
        scanner.close();
    }
}

import java.util.*;

// Define a class IllegalArgumentExceptionHandler to generate and handle IllegalArgumentException
public class IllegalArgumentExceptionHandler {

    // Method to generate the exception
    public static void generateException(String inputString, int startIndex, int endIndex) {
        // Attempt to create a substring with invalid indices
        String substring = inputString.substring(startIndex, endIndex);
    }

    // Method to handle the exception
    public void handleException(String inputString, int startIndex, int endIndex) {
        try {
            // Call the method generateException to deliberately cause the exception
            generateException(inputString, startIndex, endIndex);
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Instantiate the IllegalArgumentExceptionHandler class
        IllegalArgumentExceptionHandler exceptionHandler = new IllegalArgumentExceptionHandler();

        // Call the method to handle the exception with invalid indices
        exceptionHandler.handleException(userInput, userInput.length() - 1, userInput.length() - 2);

        // Close the Scanner object
        scanner.close();
    }
}

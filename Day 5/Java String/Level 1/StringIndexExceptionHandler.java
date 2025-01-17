import java.util.*;

// Define a class StringIndexExceptionHandler to demonstrate and handle StringIndexOutOfBoundsException
public class StringIndexExceptionHandler {

    // Method to generate the exception
    public static void generateException(String inputString) {
        // Attempt to access an index beyond the length of the string
        char invalidChar = inputString.charAt(inputString.length() + 1);
    }

    // Method to handle the exception
    public void handleException(String inputString) {
        try {
            // Call the method generateException to deliberately cause the exception
            generateException(inputString);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception and print a descriptive message
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Instantiate the StringIndexExceptionHandler class
        StringIndexExceptionHandler exceptionHandler = new StringIndexExceptionHandler();

        // Call the method to handle the exception
        exceptionHandler.handleException(userInput);

        // Close the Scanner object
        scanner.close();
    }
}

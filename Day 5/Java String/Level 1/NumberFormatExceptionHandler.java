import java.util.*;

// Define a class NumberFormatExceptionHandler to generate and handle NumberFormatException
class NumberFormatExceptionHandler {

    // Method to generate the exception
    public static void generateException(String inputString) {
        // Attempt to parse the string into an integer
        int number = Integer.parseInt(inputString);
    }

    // Method to handle the exception
    public void handleException(String inputString) {
        try {
            // Call the method generateException to deliberately cause the exception
            generateException(inputString);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException and print a descriptive message
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Instantiate the NumberFormatExceptionHandler class
        NumberFormatExceptionHandler exceptionHandler = new NumberFormatExceptionHandler();

        // Call the method to handle the exception
        exceptionHandler.handleException(userInput);

        // Close the Scanner object
        scanner.close();
    }
}

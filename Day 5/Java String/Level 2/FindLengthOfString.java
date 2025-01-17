import java.util.*;

// Create a class FindLengthOfString to determine the length of a string
public class FindLengthOfString {

    // Method to find the length of a string without using built-in methods
    public static int calculateLength(String inputString) {
        // Variable to count the length of the string
        int lengthCount = 0;
        try {
            while (true) {
                inputString.charAt(lengthCount); // Accessing each character
                lengthCount++; // Increment the count
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Return the length count when the exception occurs
            return lengthCount;
        }
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calculate the length using the custom method
        int userDefinedLength = calculateLength(userInput);

        // Calculate the length using the built-in method
        int builtInLength = userInput.length();

        // Display the results
        System.out.println("Length found by user-defined method: " + userDefinedLength);
        System.out.println("Length found by built-in method: " + builtInLength);

        // Close the Scanner object
        scanner.close();
    }
}

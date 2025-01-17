import java.util.*;

// Define a class StringToArrayConverter to handle string-to-array conversion
public class StringToArrayConverter {

    // Define a method to convert a string into a character array
    public static char[] convertToCharArray(String input) {
        char[] charArray = new char[input.length()];
        for (int index = 0; index < input.length(); index++) {
            charArray[index] = input.charAt(index);
        }
        return charArray;
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the string input from the user
        System.out.print("Enter a String: ");
        String userInput = scanner.next();

        // Convert the string to a character array using the custom method
        char[] customCharArray = convertToCharArray(userInput);

        // Print the characters from the custom character array
        System.out.println("Characters using custom method:");
        for (char character : customCharArray) {
            System.out.print(character + " ");
        }
        System.out.println();

        // Convert the string to a character array using the built-in method
        char[] builtinCharArray = userInput.toCharArray();

        // Print the characters from the built-in character array
        System.out.println("Characters using built-in toCharArray method:");
        for (char character : builtinCharArray) {
            System.out.print(character + " ");
        }

        // Compare both character arrays for equality
        boolean areArraysEqual = Arrays.equals(customCharArray, builtinCharArray);

        // Print the comparison result
        System.out.println("\nAre both arrays identical? " + areArraysEqual);

        // Close the scanner
        scanner.close();
    }
}

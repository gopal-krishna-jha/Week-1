import java.util.*;

// Define a class ConvertToUpperCase to convert text to uppercase and compare
public class ConvertToUpperCase {

    // Method to convert text to uppercase without using built-in methods
    public static String convertToUpperCase(String inputText) {
        StringBuilder upperCaseText = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            // Check if the character is lowercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                upperCaseText.append((char) (currentChar - 32));
            } else {
                upperCaseText.append(currentChar);
            }
        }
        return upperCaseText.toString();
    }

    // Method to compare two strings
    public static boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Convert the input text to uppercase using the custom method
        String customUpperCaseText = convertToUpperCase(userInput);

        // Convert the input text to uppercase using the built-in method
        String builtInUpperCaseText = userInput.toUpperCase();

        // Compare the results of both methods
        boolean isEqual = areStringsEqual(customUpperCaseText, builtInUpperCaseText);

        // Display the results
        System.out.println("Custom Uppercase Conversion: " + customUpperCaseText);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpperCaseText);
        System.out.println("Are both conversions equal? " + isEqual);

        // Close the Scanner object
        scanner.close();
    }
}

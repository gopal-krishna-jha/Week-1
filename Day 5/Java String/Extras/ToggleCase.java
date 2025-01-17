import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle the case of each character
        String toggledString = toggleCase(input);

        // Print the modified string
        System.out.println("String after toggling case: " + toggledString);

        // Close the scanner
        scanner.close();
    }

    // Method to toggle the case of each character in a string
    private static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c)); // Convert to lowercase
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c)); // Convert to uppercase
            } else {
                result.append(c); // Keep non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }
}

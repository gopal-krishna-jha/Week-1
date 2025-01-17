import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicate characters from the string
        String result = removeDuplicates(input);

        // Print the modified string
        System.out.println("String after removing duplicates: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to remove duplicate characters from a string
    private static String removeDuplicates(String str) {
        // Use a boolean array to track seen characters (ASCII assumption)
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (!seen[c]) { // If the character is not already seen
                seen[c] = true; // Mark it as seen
                result.append(c); // Add it to the result
            }
        }

        return result.toString();
    }
}

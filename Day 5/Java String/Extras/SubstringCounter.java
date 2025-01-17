import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Count the occurrences of the substring
        int count = countOccurrences(mainString, substring);

        // Print the result
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");

        // Close the scanner
        scanner.close();
    }

    // Method to count occurrences of a substring in a string
    private static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Use a loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move past the last found occurrence
        }

        return count;
    }
}

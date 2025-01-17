import java.util.Scanner;

public class TrimString {

    // Method to find the start and end indices for trimming spaces
    public static int[] findTrimIndices(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;

        // Trim leading spaces
        while (startIndex <= endIndex && str.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Trim trailing spaces
        while (endIndex >= startIndex && str.charAt(endIndex) == ' ') {
            endIndex--;
        }

        return new int[] { startIndex, endIndex };
    }

    // Method to create a substring from the original string
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create an object of scanner class
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Find indices to trim leading and trailing spaces
        int[] trimIndices = findTrimIndices(inputString);
        int startIndex = trimIndices[0];
        int endIndex = trimIndices[1];

        // Create a trimmed substring using the charAt method
        String trimmedString = createSubstring(inputString, startIndex, endIndex);

        // Use the built-in trim method to trim spaces
        String builtInTrimmedString = inputString.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedString, builtInTrimmedString);

        // Display the results
        System.out.println("Trimmed String using charAt: '" + trimmedString + "'");
        System.out.println("Trimmed String using built-in method: '" + builtInTrimmedString + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        input.close();
    }
}

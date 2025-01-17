

import java.util.*;

// Define a class SubstringGenerator to generate substrings
public class SubstringGenerator {

    public static String extractSubstring(String inputString, int startIdx, int endIdx) {
        String substringResult = "";

        for (int i = startIdx; i < endIdx; i++) {
            substringResult += inputString.charAt(i);
        }

        return substringResult;
    }

    // Define a method to compare two strings using charAt
    public static boolean areStringsIdentical(String firstString, String secondString) {
        if (firstString.length() == secondString.length()) {
            for (int index = 0; index < firstString.length(); index++) {
                if (firstString.charAt(index) != secondString.charAt(index)) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Instantiate a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the main input string from the user
        System.out.print("Enter String: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = scanner.nextInt();

        // Use extractSubstring to get a substring
        String customSubstring = extractSubstring(mainString, startIndex, endIndex);

        // Use the built-in substring method
        String builtinSubstring = mainString.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean areSubstringsEqual = areStringsIdentical(customSubstring, builtinSubstring);

        // Display the results
        System.out.println("Substring created using charAt: " + customSubstring);
        System.out.println("Substring created using substring method: " + builtinSubstring);
        System.out.println("Are both substrings identical? " + areSubstringsEqual);

        scanner.close();
    }
}

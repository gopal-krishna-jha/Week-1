
import java.util.*;

// Create a class SplitTheString to split the words of a string
public class SplitTheString {

    // Method to find the length of the string
    public static int calculateLength(String inputString) {
        int length = 0;
        char[] charArray = inputString.toCharArray();
        for (char c : charArray) {
            length++;
        }
        return length;
    }

    // Method to split the string into words using the charAt() method
    public static String[] splitIntoWords(String inputString) {
        int length = calculateLength(inputString);
        int wordCount = 1;

        // Counting the number of words
        for (int i = 0; i < length; i++) {
            if (inputString.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store spaceIndexes (not used in this version)
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (inputString.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Create an array to store the words of the string
        String[] words = new String[wordCount];
        int startIndex = 0;
        index = 0;
        for (int i = 0; i < length; i++) {
            if (i == length - 1 || inputString.charAt(i) == ' ') {
                words[index++] = inputString.substring(startIndex, i).trim();
                startIndex = i + 1;
            }
        }

        // Handling the last character for the last word
        if (length > 0 && inputString.charAt(length - 1) != ' ') {
            words[index - 1] += inputString.charAt(length - 1);
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        // Create an object of the Scanner class
        Scanner input = new Scanner(System.in);

        // Create a variable inputString and take user input
        System.out.print("Enter string: ");
        String inputString = input.nextLine();

        // Create a variable userDefinedSplitWords to store the result from the custom
        // method
        String[] userDefinedSplitWords = splitIntoWords(inputString);

        // Create a variable builtInSplitWords to store the result using the built-in
        // method
        String[] builtInSplitWords = inputString.split("\\s+");

        // Create a variable areEqual to store the result of the comparison
        boolean areEqual = compareStringArrays(userDefinedSplitWords, builtInSplitWords);

        // Print the results
        System.out.println("User-Defined method to Split String:");
        for (String word : userDefinedSplitWords) {
            System.out.println(word + " ");
        }

        System.out.println("\nBuilt-in method to Split String:");
        for (String word : builtInSplitWords) {
            System.out.println(word + " ");
        }

        System.out.println("\nBoth are equal: " + areEqual);

        // Close the Scanner
        input.close();
    }
}

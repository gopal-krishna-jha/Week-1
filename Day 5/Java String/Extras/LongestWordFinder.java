import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);

        // Print the longest word
        System.out.println("The longest word is: " + longestWord);

        // Close the scanner
        scanner.close();
    }

    // Method to find the longest word in a sentence
    private static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update the longest word
            }
        }

        return longestWord;
    }
}

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to handle case insensitivity
        String lowerCaseInput = input.toLowerCase();

        // Loop through each character in the string
        for (char c : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter
                if (isVowel(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
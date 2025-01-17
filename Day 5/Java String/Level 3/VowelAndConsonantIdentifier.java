import java.util.Scanner;

public class VowelAndConsonantIdentifier {

    // Method to check if the character is a vowel or consonant
    public static String checkCharacter(char ch) {
        // Convert character to lowercase
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str) {
        int length = str.length();
        String[][] result = new String[length][2]; // 2D array to store characters and their types

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            String characterType = checkCharacter(currentChar);
            result[i][0] = String.valueOf(currentChar); // Store the character
            result[i][1] = characterType; // Store whether it's a vowel, consonant, or not a letter
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("--------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        // Create an object of scanner class
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Call the method to find vowels and consonants
        String[][] result = findVowelsAndConsonants(inputString);

        // Display the result in tabular format
        displayResult(result);

        input.close();
    }
}

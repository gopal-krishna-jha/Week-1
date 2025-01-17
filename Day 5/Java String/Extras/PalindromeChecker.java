import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Print the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Initialize two pointers: one at the beginning and one at the end
        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends until the pointers meet
        while (left < right) {
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
                continue;
            }

            // Compare the characters
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            // Move the pointers closer to the center
            left++;
            right--;
        }

        return true; // The string is a palindrome
    }
}

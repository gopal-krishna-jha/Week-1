import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string manually
        String reversed = reverseString(input);

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a string without using built-in reverse functions
    private static String reverseString(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Initialize two pointers: one at the beginning and one at the end
        int left = 0;
        int right = chars.length - 1;

        // Swap characters until the pointers meet in the middle
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the pointers closer to the center
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(chars);
    }
}
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings from the user
        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();

        // Compare the two strings
        int result = compareStrings(str1, str2);

        // Display the result
        if (result < 0) {
            System.out.println("String 1 is lexicographically less than String 2.");
        } else if (result > 0) {
            System.out.println("String 1 is lexicographically greater than String 2.");
        } else {
            System.out.println("Both strings are equal.");
        }

        scanner.close();
    }

    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; // Return the difference of the first non-matching characters
            }
        }

        // If all characters are equal, compare lengths
        return str1.length() - str2.length();
    }
}

import java.util.*;
// Define a class StringComparator to compare strings
public class StringComparator {

    public static boolean areStringsEqual(String firstString, String secondString) {
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

        // Define two variables stringOne and stringTwo for user input
        System.out.print("Enter String 1: ");
        String stringOne = scanner.next();
        System.out.print("Enter String 2: ");
        String stringTwo = scanner.next();

        // Define a variable comparisonResult to store the result of the method
        boolean comparisonResult = areStringsEqual(stringOne, stringTwo);
        boolean equalsMethodResult = stringOne.equals(stringTwo);

        System.out.println("String comparison using charAt method: " + comparisonResult);
        System.out.println("String comparison using equals method: " + equalsMethodResult);

        scanner.close();
    }
}

import java.util.*;

//Create a class ConvertTOLowerCase to convert text into uppercase and compare
public class ConvertTOUpperCase1 {

    // Create a method getLowerCaseText to get uppercase text
    public static String getLowerCaseText(String str) {
        String text = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                text += ((char) (str.charAt(i) + 32));
            } else {
                text += str.charAt(i);
            }

        }
        return text;
    }

    // Create a compareStrings method to compare two string
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        // Create an object of scanner class
        Scanner input = new Scanner(System.in);

        // Create a variable inputString and take user input
        System.out.print("Enter String : ");
        String inputString = input.nextLine();

        // Create a variable text1 to store the result and cal l a method
        String text1 = getLowerCaseText(inputString);

        // Create a variable text2 to convert text from lowercase to uppercase
        String text2 = inputString.toLowerCase();

        // Create a variable areEqual to store the result
        boolean areEqual = compareStrings(text1, text2);

        // Print the Result
        System.out.println("User-Define Uppercase Text: " + text1);
        System.out.println("Built-in Uppercase Text: " + text2);
        System.out.println("Are both texts equal: " + areEqual);

        input.close();
    }

}

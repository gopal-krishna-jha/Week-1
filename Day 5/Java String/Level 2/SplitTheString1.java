import java.util.*;

// Create a class SplitTheString1 to split the string
public class SplitTheString1 {

    // Create a method to find the length of the string
    public static int calculateLength(String str) {
        int length = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            length++;
        }
        return length;
    }

    // Create a method to split the string into words using charAt() method
    public static String[] splitIntoWords(String str) {
        int length = calculateLength(str);
        int wordCount = 1;

        // Counting the number of words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array words to store the values
        String[] words = new String[wordCount];
        int startIndex = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' || i == length - 1) {
                words[index++] = str.substring(startIndex, (i == length - 1) ? length : i).trim();
                startIndex = i + 1;
            }
        }

        return words;
    }

    // Create a method to get a 2D array of words and their lengths
    public static String[][] getWordsOfString(String[] words) {
        String[][] wordsAndLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordsAndLengths[i][0] = words[i];
            wordsAndLengths[i][1] = String.valueOf(calculateLength(words[i]));
        }

        return wordsAndLengths;
    }

    public static void main(String[] args) {
        // Create an object of the Scanner class
        Scanner input = new Scanner(System.in);

        // Create variable inputString and take user input
        System.out.print("Enter string: ");
        String inputString = input.nextLine();

        // Create an array words to store the values and call a method
        String[] words = splitIntoWords(inputString);

        // Create a 2D array to store the results
        String[][] finalResult = getWordsOfString(words);

        // Displaying the result in a tabular format
        System.out.println("Word\tLength");
        System.out.println("-------------------");
        for (String[] value : finalResult) {
            System.out.printf("%s\t%d%n", value[0], Integer.parseInt(value[1]));
        }

        input.close();
    }
}

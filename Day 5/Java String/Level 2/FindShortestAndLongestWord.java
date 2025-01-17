import java.util.Scanner;

// Create a class FindShortestAndLongestWord to find the shortest and longest word
public class FindShortestAndLongestWord {

    // Create a method to split the string into words using charAt() method
    public static String[] splitIntoWords(String str) {
        int length = str.length();
        int wordCount = 1;

        // Counting the number of words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array words to store values
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

    // Create a method to calculate the length of a string without using length()
    // method
    public static int calculateLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Create a method to create a 2D array of words and their corresponding lengths
    public static String[][] calculateWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(calculateLength(words[i]));
        }
        return wordsWithLengths;
    }

    // Create a method to find the shortest and longest word from the 2D array
    public static String[] findShortestAndLongestWords(String[][] words) {
        String shortestWord = words[0][0];
        String longestWord = words[0][0];
        int minLength = Integer.parseInt(words[0][1]);
        int maxLength = Integer.parseInt(words[0][1]);

        for (int i = 1; i < words.length; i++) {
            int length = Integer.parseInt(words[i][1]);
            if (length < minLength) {
                minLength = length;
                shortestWord = words[i][0];
            }
            if (length > maxLength) {
                maxLength = length;
                longestWord = words[i][0];
            }
        }

        return new String[] { shortestWord, longestWord };
    }

    public static void main(String[] args) {
        // Create an object of scanner class
        Scanner input = new Scanner(System.in);

        // Create variable inputString and take user input
        System.out.print("Enter string: ");
        String inputString = input.nextLine();

        // Create an array words to store the value and call a method
        String[] words = splitIntoWords(inputString);

        // Create a 2D array wordsWithLengths to store the value and call a method
        String[][] wordsWithLengths = calculateWordsWithLengths(words);

        // Create an array finalResult to store the value and call a method
        String[] finalResult = findShortestAndLongestWords(wordsWithLengths);

        // Print the Result
        System.out.println("Shortest Word in the string is: " + finalResult[0]);
        System.out.println("Longest Word in the string is: " + finalResult[1]);

        input.close();
    }
}

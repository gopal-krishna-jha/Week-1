import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence and the words to replace
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();

        // Iterate through the words and replace when necessary
        for (String word : words) {
            if (word.equals(oldWord)) {
                modifiedSentence.append(newWord);
            } else {
                modifiedSentence.append(word);
            }
            modifiedSentence.append(" "); // Add space after each word
        }

        // Trim the final sentence to remove any extra spaces
        return modifiedSentence.toString().trim();
    }
}

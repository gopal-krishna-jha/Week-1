import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static char findMostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character for empty or null string
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String str = "success";
        char mostFrequent = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        str = "programming";
        mostFrequent = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        str = ""; // Test empty string
        mostFrequent = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        str = null; // Test null string
        mostFrequent = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        str = "aabbc";
        mostFrequent = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

    }
}
public class LexicographicalComparison {

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        String result = compareLexicographically(str1, str2);
        System.out.println(result);

        str1 = "zebra";
        str2 = "zoo";
        result = compareLexicographically(str1, str2);
        System.out.println(result);

        str1 = "same";
        str2 = "same";
        result = compareLexicographically(str1, str2);
        System.out.println(result);
    }

    public static String compareLexicographically(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (char1 > char2) {
                return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
            }
        }

        // If all characters are the same up to the shortest length
        if (len1 < len2) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (len1 > len2) {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
        } else {
            return "\"" + str1 + "\" is equal to \"" + str2 + "\"";
        }
    }
}

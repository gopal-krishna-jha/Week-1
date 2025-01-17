public class RemoveCharacterFromString {

    public static String removeCharacter(String str, char charToRemove) {
        if (str == null || str.isEmpty()) {
            return str; // Return original string if null or empty
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != charToRemove) {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        char charToRemove = 'l';
        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");

        str = "Mississippi";
        charToRemove = 's';
        modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");

        str = ""; // Test empty string
        charToRemove = 'a';
        modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");

        str = null; // Test null string
        charToRemove = 'b';
        modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");

        str = "aaaa";
        charToRemove = 'a';
        modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");
    }
}
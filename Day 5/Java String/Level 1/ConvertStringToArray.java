import java.util.*;

//Create a class ConvertStringToArray to compare strings
public class ConvertStringToArray {

    // Create a method getCharacters to generate character
    public static char[] getCharacters(String str) {
        char characters[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    public static void main(String[] args) {
        // Create an object of scanner class
        Scanner input = new Scanner(System.in);

        // Create two variable inputString and take user input
        System.out.print("Enter String : ");
        String inputString = input.next();

        // Create a array characters to store the result and call method
        char characters1[] = getCharacters(inputString);

        // Print the characters of characters1 array
        System.out.println("Character using User-Define method:");
        for (char value : characters1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Create a array characters2 to store values
        char characters2[] = inputString.toCharArray();

        // Print the characters of characters2 array
        System.out.println("Character using In-built method toCharArray:");
        for (char value : characters2) {
            System.out.print(value + " ");
        }

        // Create a variable to compareResult to check that arrays are equals
        boolean compareResult = Arrays.equals(characters1, characters2);

        // Print the Result
        System.out.println("\nIs both the array are same: " + compareResult);

        input.close();

    }
}

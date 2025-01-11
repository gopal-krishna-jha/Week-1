
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the age and height of the 3 friends
        System.out.print("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();

        // Find the smallest of the 3 ages to find the youngest friend
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }

        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

        // Find the largest of the 3 heights to find the tallest friend
        int tallestHeight = heightAmar;
        String tallestFriend = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }

        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        // Close the scanner
        scanner.close();
    }
}

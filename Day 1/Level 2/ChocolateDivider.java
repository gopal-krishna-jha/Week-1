import java.util.Scanner;

// Creating a class named ChocolateDivider
public class ChocolateDivider {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Prompt the user to enter the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets and the number of
        // remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild
                + " and the number of remaining chocolates are " + remainingChocolates);

        // Close the Scanner object
        scanner.close();
    }
}

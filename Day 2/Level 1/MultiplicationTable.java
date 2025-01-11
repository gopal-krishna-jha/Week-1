import java.util.Scanner;

// Creating a class named MultiplicationTable
public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number for which the multiplication table is to
        // be printed
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using a for loop to find the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the Scanner object
        scanner.close();
    }
}

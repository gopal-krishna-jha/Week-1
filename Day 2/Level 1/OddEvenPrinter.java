import java.util.Scanner;

// Creating a class named OddEvenPrinter 
public class OddEvenPrinter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the user has entered a positive integer
        if (number >= 1) {
            // Using a for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even or odd and print the result
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            // Output if the number is not a positive integer
            System.out.println("Please enter a positive integer greater than or equal to 1.");
        }

        // Close the Scanner object
        scanner.close();
    }
}

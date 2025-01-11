import java.util.Scanner;

// Creating a class named NaturalNumberSumComparison 
public class NaturalNumberSumComparison1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Compute the sum using the formula n * (n + 1) / 2
            int sumFormula = number * (number + 1) / 2;

            // Compute the sum using a for loop
            int sumForLoop = 0;
            for (int i = 0; i <= number; i++) {
                sumForLoop += i;
            }

            // Output the results from both computations
            System.out.println("The sum of " + number + " natural numbers using the formula is " + sumFormula);
            System.out.println("The sum of " + number + " natural numbers using the for loop is " + sumForLoop);

            // Compare the two results and show whether they are correct
            if (sumFormula == sumForLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        } else {
            // Output the result if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner object
        scanner.close();
    }
}

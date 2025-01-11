import java.util.*;

public class FactorFinder {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If index is equal to maxFactor, double the size of the factors array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                // Add the factor to the array and increment the index
                factors[index++] = i;
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
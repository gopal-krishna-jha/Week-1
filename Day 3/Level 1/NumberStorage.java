import java.util.Scanner;

public class NumberStorage {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define an array to store up to 10 elements of type double
        double[] numbers = new double[10];

        // Variable to store the total, initialized to 0.0
        double total = 0.0;

        // Index variable initialized to 0 for the array
        int index = 0;

        // Infinite while loop to take user input
        while (true) {
            // Prompt the user for input
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Check if the user entered 0 or a negative number to break the loop
            if (number <= 0) {
                break;
            }

            // Store the number in the array and increment the index value
            numbers[index] = number;
            index++;

            // Break the loop if the index reaches the array size limit of 10
            if (index == 10) {
                break;
            }
        }

        // Loop to display the numbers and calculate the total
        System.out.println("The numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total value
        System.out.println("The sum of all numbers is: " + total);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
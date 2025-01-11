import java.util.Scanner;

// Creating a class named WeightConverter
public class WeightConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert weight from pounds to kilograms using the formula: 1 pound = 2.2
        // kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Output the result according to the specified format
        System.out.println("The weight of the person in pound is " + weightInPounds +
                " and in kg is " + weightInKilograms);

        // Close the Scanner object
        scanner.close();
    }
}

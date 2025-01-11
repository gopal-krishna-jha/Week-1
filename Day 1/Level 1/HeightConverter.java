import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Convert the height from centimeters to inches
        double heightInInches = heightInCm / 2.54;

        // Convert the height from inches to feet and inches
        int feet = (int) (heightInInches / 12); // Extract the feet part
        double inches = heightInInches % 12; // Extract the remaining inches

        // Output the result
        System.out.println("Your height in cm is " + heightInCm +
                " while in feet is " + feet +
                " and inches is " + inches);

        // Close the Scanner object
        scanner.close();
    }
}

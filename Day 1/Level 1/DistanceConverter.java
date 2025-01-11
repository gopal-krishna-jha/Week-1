import java.util.Scanner;

// Creating a class named DistanceConverter 
public class DistanceConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert the distance to inches (1 foot = 12 inches)
        double distanceInInches = distanceInFeet * 12;

        // Convert the distance to centimeters (1 inch = 2.54 centimeters)
        double distanceInCentimeters = distanceInInches * 2.54;

        // Output the results
        System.out.println("Your distance in cm is " + distanceInCentimeters + " while in feet is " + distanceInFeet
                + " and in inches is " + distanceInInches);

        // Close the Scanner object
        scanner.close();
    }
}

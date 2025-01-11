import java.util.*;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking input.
        Scanner scanner = new Scanner(System.in);

        // Create a variable named "perimeter" for calculating perimeter.
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Create a variable named "side" for Calculating the side of the square.
        double side = perimeter / 4;

        // Output the result.
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Closing the scanner.
        scanner.close();
    }
}

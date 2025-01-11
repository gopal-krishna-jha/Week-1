import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = scanner.nextDouble();

        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert the base and height from inches to centimeters
        double baseInCm = baseInInches * 2.54;
        double heightInCm = heightInInches * 2.54;

        // Calculate the area in square centimeters
        double areaInSquareCm = 0.5 * baseInCm * heightInCm;

        // Output the results
        System.out.println("The area of the triangle with base " + baseInInches + " inches and height " + heightInInches
                + " inches is:");
        System.out.println(areaInSquareInches + " square inches");
        System.out.println(areaInSquareCm + " square centimeters");

        // Close the Scanner object
        scanner.close();
    }

}

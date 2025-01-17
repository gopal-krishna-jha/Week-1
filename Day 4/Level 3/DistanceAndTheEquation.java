import java.util.*;

//Create a class to DistanceAndEquation to compute distance and equation
public class DistanceAndTheEquation {

    // Create a method to calculate Euclidean distance
    public double calculatetheDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2)) + Math.sqrt(Math.pow(y2 - y1, 2));
    }

    // create a method to find the equation
    public double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Create variable and take input from user
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Create an object of DistanceAndEquation class
        DistanceAndTheEquation getResult = new DistanceAndTheEquation();

        // Create a variable distance to store result and call a method
        double distance = getResult.calculatetheDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        double[] equation = getResult.getLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);

        input.close();
    }
}
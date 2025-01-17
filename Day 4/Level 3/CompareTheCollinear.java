import java.util.*;

//Create a class CompareCollinear to find slope and area and compare them
public class CompareTheCollinear {

    // Create a method to find collinear slope
    public boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // create a method to check the collinear area
    public boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {

        // Create an object of scanner class
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
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Create an object of CompareCollinear class
        CompareTheCollinear getResult = new CompareTheCollinear();

        // Check collinearity using slope formula
        boolean collinearSlope = getResult.isCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula: " + collinearSlope);

        // Check collinearity using area formula
        boolean collinearArea = getResult.isCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + collinearArea);

        // Sample check for given points (2, 4), (4, 6), (6, 8) and print the result
        double x1_sample = 2, y1_sample = 4, x2_sample = 4, y2_sample = 6, x3_sample = 6, y3_sample = 8;
        boolean sampleCollinearSlope = getResult.isCollinearSlope(x1_sample, y1_sample, x2_sample, y2_sample,
                x3_sample, y3_sample);
        boolean sampleCollinearArea = getResult.isCollinearArea(x1_sample, y1_sample, x2_sample, y2_sample, x3_sample,
                y3_sample);
        System.out.println(
                "Sample points (2, 4), (4, 6), (6, 8) are collinear using slope formula: " + sampleCollinearSlope);
        System.out.println(
                "Sample points (2, 4), (4, 6), (6, 8) are collinear using area formula: " + sampleCollinearArea);

        input.close();
    }
}
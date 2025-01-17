import java.util.*;

//create a class CalculateTrignometric to compute Trigonometric function
public class CalculateTrignometric {
    // create a method calculateTrigonometricFunctions to calculate trigonometric
    // values
    public double[] calculateTrigonometricFunctions(double angle) {

        // create variable sine, cosine and tangent and calculate sin, cos and tan
        double sine = Math.sin(angle);
        double cosine = Math.cos(angle);
        double tangent = Math.tan(angle);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        // create a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // create variables angle and take input from user
        System.out.print("Enter an angle in degree:");
        double angle = input.nextDouble();

        // create a variable to convert angle from degree to radian
        double radian = Math.toRadians(angle);

        // create CalculateTrignometric class object
        CalculateTrignometric calculator = new CalculateTrignometric();

        // create an array result to store value and call a method
        double result[] = calculator.calculateTrigonometricFunctions(radian);

        // Print the result
        System.out.printf("Sine: " + result[0] + "\nCosine: " + result[1] + "\nTangent: " + result[2]);

        input.close();
    }
}

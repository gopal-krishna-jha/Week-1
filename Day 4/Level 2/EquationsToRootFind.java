import java.util.Scanner;

// Create a class EquationsRootFind to find the roots of equation
public class EquationsToRootFind {

    // Create a method findRoots to find a root
    public static double[] findRoots(double a, double b, double c) {

        // Create a variable delta to calculate the delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive the find the two roots
        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            double[] root = new double[2];
            root[0] = root1;
            root[1] = root2;
            return root;
        } else if (delta == 0) {
            // If delta is zero
            double root = -b / (2 * a);
            double[] roots = new double[1];
            roots[0] = root;
            return roots;
        } else {
            // if negative delta
            return new double[] {}; // Return an empty array
        }
    }

    public static void main(String[] args) {
        // Create a Scanner class object to take input from user
        Scanner input = new Scanner(System.in);

        // Now, take input a, b, and c
        System.out.print("Enter the value a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value c: ");
        double c = input.nextDouble();

        // Check if it's a valid quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
        } else {
            // Create double array roots to find the roots
            double[] roots = findRoots(a, b, c);

            // Print the results
            if (roots.length == 2) {
                System.out.println("The equation has two roots:");
                System.out.println("Root 1 is: " + roots[0]);
                System.out.println("Root 2 is: " + roots[1]);
            } else if (roots.length == 1) {
                System.out.println("The equation has one root:");
                System.out.println("Root is: " + roots[0]);
            } else {
                System.out.println("The equation has no roots.");
            }
        }

        // scanner class object
        input.close();
    }
}

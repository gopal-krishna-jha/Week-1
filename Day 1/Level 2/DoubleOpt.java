import java.util.Scanner;

// Creating a class named DoubleOpt
public class DoubleOpt {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first double value
        System.out.print("Enter the first double value (a): ");
        double a = scanner.nextDouble();

        // Prompt the user to enter the second double value
        System.out.print("Enter the second double value (b): ");
        double b = scanner.nextDouble();

        // Prompt the user to enter the third double value
        System.out.print("Enter the third double value (c): ");
        double c = scanner.nextDouble();

        // Perform the double operations
        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;

        // Output the results according to the specified format
        System.out.println("The results of Double Operations are " + operation1 + ", " + operation2 + ", " + operation3
                + ", and " + operation4);

        // Close the Scanner object
        scanner.close();
    }
}

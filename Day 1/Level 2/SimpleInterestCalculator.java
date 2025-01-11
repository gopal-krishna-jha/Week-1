import java.util.Scanner;

// Creating a class named SimpleInterestCalculator
public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time period in years
        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();

        // Calculate the simple interest using the formula: Simple Interest = Principal
        // * Rate * Time / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result according to the specified format
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + ", Rate of Interest " + rate + " and Time " + time);
        // Close the Scanner object
        scanner.close();
    }
}
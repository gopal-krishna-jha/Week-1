import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input weight in kg
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        // Prompt user to input height in cm
        System.out.print("Enter your height (in cm): ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on the BMI value
        if (bmi <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        // Close the scanner object
        scanner.close();
    }
}

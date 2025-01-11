import java.util.Scanner;

//create BasicCalculator
public class BasicCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        float number1 = scanner.nextFloat();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        float number2 = scanner.nextFloat();

        // Perform arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Output the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1
                + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and "
                + division + " respectively.");
        // Close the Scanner object
        scanner.close();
    }
}

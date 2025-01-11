import java.util.Scanner;

// Creating a class named TemperaturConversion
public class TemperaturConversion {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula: (°F − 32) x 5/9 = °C
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        // Close the Scanner object
        scanner.close();
    }
}
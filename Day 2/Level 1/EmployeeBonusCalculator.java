import java.util.Scanner;

// Creating a class named EmployeeBonusCalculator 
public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        // Prompt the user to enter the years of service
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Initialize the bonus amount to 0
        double bonus = 0;

        // Check if the years of service is more than 5 to calculate the bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            bonus = salary * 0.05;
        }

        // Output the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        // Close the Scanner object
        scanner.close();
    }
}

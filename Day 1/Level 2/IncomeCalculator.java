import java.util.Scanner;

// Creating a class named IncomeCalculator
public class IncomeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter the salary in INR: ");
        double salary = scanner.nextDouble();

        // Prompt the user to enter the bonus
        System.out.print("Enter the bonus in INR: ");
        double bonus = scanner.nextDouble();

        // Compute the total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Output the result according to the specified format
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR "
                + totalIncome);

        // Close the Scanner object
        scanner.close();
    }
}

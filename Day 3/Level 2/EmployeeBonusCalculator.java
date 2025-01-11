import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define arrays to save salary, years of service, new salary, and bonus amount for each employee
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];

        // Variables to save the total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input from the user for salaries and years of service
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--; // Decrement the index to ask for input again
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--; // Decrement the index to ask for input again
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Loop to calculate the bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05; // 5% bonus
            } else {
                bonus = salaries[i] * 0.02; // 2% bonus
            }

            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
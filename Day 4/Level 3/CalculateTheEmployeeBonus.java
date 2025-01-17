import java.util.*;

//create a class CalculateEmployeeBonus to find the employee bonus
public class CalculateTheEmployeeBonus {

    // Create a method to generate salary and years of service
    public int[][] getTheEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numberOfEmployees][2];
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = 50000 + random.nextInt(50000); // 5-digit salary
            employeeData[i][1] = random.nextInt(11); // Years of service (0 to 10 years)
        }
        return employeeData;
    }

    // Create a method to calculate the new salary and bonus
    public double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] newSalaryAndBonus = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonus;
        }
        return newSalaryAndBonus;
    }

    // Create a method to calculate and display the sum of old salary, new salary,
    // and total bonus
    public static void printSalaryAndBonus(int[][] employeeData, double[][] newSalaryAndBonus) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Print and calculate the result
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Emp No.", "Old Salary", "Years", "Bonus", "New Salary");

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = newSalaryAndBonus[i][1];
            double newSalary = newSalaryAndBonus[i][0];

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", (i + 1), salary, yearsOfService, bonus, newSalary);
        }
        // Print the final result
        System.out.println("\nSummary:");
        System.out.print("Total Old Salary : " + totalOldSalary + "\nTotal New Salary : " + totalNewSalary
                + "\nTotal Bonus Amount : " + totalBonus);
    }

    public static void main(String[] args) {

        // Create a variable numberOfEmployees to store the number of employee
        int numberOfEmployees = 10;

        // Create an object of CalculateEmployeeBonus class
        CalculateTheEmployeeBonus getResult = new CalculateTheEmployeeBonus();

        // Create an 2D array employeeData to store the result and call a method
        int[][] employeeData = getResult.getTheEmployeeData(numberOfEmployees);

        // Create an array 2D newSalary to store value and call a method
        double[][] newSalary = getResult.calculateNewSalaryAndBonus(employeeData);

        // Print the result
        printSalaryAndBonus(employeeData, newSalary);
    }
}
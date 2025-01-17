import java.util.Scanner;

// Create a class CalculateBMI to calculate a bmi
public class CalculatetheBMI {

    // Create a static method calculateBMI to calculate the BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            // Create a variable weight to store weight
            double weight = data[i][0];

            // Create a variable heightInMeters to store height in centimeter
            double heightInMeters = data[i][1] / 100;

            // Create a variable bmi to store bmi
            double bmi = weight / (heightInMeters * heightInMeters);

            // Store bmi in array third column
            data[i][2] = bmi;
        }

    }

    // Create a static method determineBMIStatus to check bmi status
    public static String[] determineBMIStatus(double[][] data) {

        // Create a string array statuses to store bmi status
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        // Create a Scanner class object to take input from user
        Scanner input = new Scanner(System.in);

        // Create 2D array with name data to store weight, height, and BMI for 10 people
        double[][] data = new double[10][3];

        System.out.println("Enter weight (in kg) and height (in cm) for 10 people:");

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (in kilogram): ");
            data[i][0] = input.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (in centimeter): ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(data);

        // Determine BMI status for all persons
        String[] statuses = determineBMIStatus(data);

        // Print the results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight(kg) " + data[i][0] + " Height(cm) " + (float) data[i][1]
                    + " BMI " + data[i][2] + " BMI Status is " + statuses[i]);
            System.out.println();
        }

        // scanner object close
        input.close();
    }
}

import java.util.*;

//Create a class FindBMI to compute the BMI
public class FindBMI {
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPerson = input.nextInt();

        // Create arrays weights,heights,bmis and weightStatus to store the weight,
        // height, BMI, and weight status of the persons
        double[] weights = new double[numberOfPerson];
        double[] heights = new double[numberOfPerson];
        double[] bmis = new double[numberOfPerson];
        String[] weightStatus = new String[numberOfPerson];

        // Take input from user
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input and validate weight
            System.out.print("Weight in kg : ");
            weights[i] = input.nextDouble();
            while (weights[i] < 0) {
                System.out.print("Weight cannot be negative. Enter positive value: ");
                weights[i] = input.nextDouble();
            }

            // Input height from user
            System.out.print("Height in cm: ");
            heights[i] = input.nextDouble();
            while (heights[i] < 0) {
                System.out.print("Height cannot be negative. Enter positive value: ");
                heights[i] = input.nextDouble();
            }

            // Create a variable heightMeter to Convert height from cm to meters
            double heightMeter = heights[i] / 100;

            // Calculate BMI and store in bmis
            bmis[i] = weights[i] / (heightMeter * heightMeter);

            // Find the weight status based on the BMI value
            if (bmis[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print the Result
        System.out.println("\nResults:");
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("Height: " + heights[i] + " cm");
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }

        // Close the input object
        input.close();
    }
}

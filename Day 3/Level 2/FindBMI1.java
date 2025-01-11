import java.util.*;

// Create a class FindBMI1 to compute the BMI
public class FindBMI1 {
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPerson = input.nextInt();

        // Create a 2D array personData to store weight, height, and BMI, and an array
        // weightStatus to store weight status
        double[][] personData = new double[numberOfPerson][3];
        String[] weightStatus = new String[numberOfPerson];

        // Take input from user
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Take Input weight
            System.out.print("Weight in kg : ");
            personData[i][0] = input.nextDouble();
            while (personData[i][0] < 0) {
                System.out.print("Weight cannot be negative. Enter positive value: ");
                personData[i][0] = input.nextDouble();
            }

            // Take Input height
            System.out.print("Height in cm: ");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] < 0) {
                System.out.print("Height cannot be negative. Enter positive value: ");
                personData[i][1] = input.nextDouble();
            }

            // Create a variable heightMeter to Convert height from cm to meters and
            // calculate BMI
            double heightMeter = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);

            // Find the weight status based on the BMI value
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print the results
        System.out.println("\nResults:");
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
        // Close the input object
        input.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random ages for students
    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(100); // Generate random age between 0 and 99
        }

        return ages;
    }

    // Method to create a 2D array of ages and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]); // Store age

            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot vote (Invalid age)";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can vote";
            } else {
                eligibility[i][1] = "Cannot vote";
            }
        }

        return eligibility;
    }

    // Method to display the eligibility in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s | %-20s%n", "Age", "Voting Eligibility");
        System.out.println("--------------------------");
        for (String[] entry : eligibility) {
            System.out.printf("%-10s | %-20s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        // Number of students
        int numberOfStudents = 10;

        // Generate random ages
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display results
        displayEligibility(eligibility);
    }
}

import java.util.*;

// create a class ScoreCalculator to calculate the score of student
 Public class CalculateTheScore {

    // Create a static method randomMarkGenerator to generate Physics, Chemistry,
    // and Math marks
    public static int[][] randomMarkGenerator(int students) {
        // Random random = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }

        return scores;
    }

    // Create a static method studentPerformanceChecker to calculate total, average,
    // and percentage of the student
    public static double[][] studentPerformanceChecker(int[][] scores) {
        int students = scores.length;
        // Create a array performanceCheck to store the performanceChecks of the student
        double[][] performanceCheck = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // store the score in array
            performanceCheck[i][0] = total;
            performanceCheck[i][1] = Math.round(average * 100.0) / 100.0;
            performanceCheck[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return performanceCheck;
    }

    // Create a static method to print the result of all student
    public static void displayScorecard(int[][] scores, double[][] performanceCheck) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f\n", (i + 1), scores[i][0], scores[i][1], scores[i][2],
performanceCheck[i][0], performanceCheck[i][1], performanceCheck[i][2]);
        }
    }

    // Create a main method
    public static void main(String[] args) {
        // Create scanner class object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a varable students to store number of the student
        System.out.print("Please Enter the number of students: ");
        int students = input.nextInt();

        // Create a varable randomMarkGenerator to generate random mark
        int[][] scores = randomMarkGenerator(students);

        // Create a varable performanceCheck to check the performance of the student
        double[][] performanceCheck = studentPerformanceChecker(scores);

        // display the score through the method
        displayScorecard(scores, performanceCheck);

        // close the scanner
        input.close();
    }
}
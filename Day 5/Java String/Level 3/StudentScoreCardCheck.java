// Create a class StudentScoreCardCheck to check the score of student 
public class StudentScoreCardCheck {

    // Create a method randomScoresGenerator to generate random scores for Physics,
    // Chemistry, and Math
    public static int[][] randomScoresGenerator(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 41) + 60;
            }
        }
        return scores;
    }

    // Create a method calculatePercentageAndTotals to calculate total, average, and
    // percentage for each student
    public static double[][] calculatePercentageAndTotals(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Now, Store the calculated values
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Create a method calculate to assign grades based on percentage
    public static char[] calculateGrades(double[][] percentages) {
        int numberOfStudents = percentages.length;
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        return grades;
    }

    // Create a method displayScoreCard method to display the complete scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10c\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    // Create a Main method
    public static void main(String[] args) {
        int numberOfStudents = 5;

        // Generate random scores
        int[][] scores = randomScoresGenerator(numberOfStudents);

        // Create a double array result to calculate totals, averages, and percentages
        double[][] results = calculatePercentageAndTotals(scores);

        // Create a char array grades to store a grade of the student
        char[] grades = calculateGrades(results);

        // Display the result
        displayScoreCard(scores, results, grades);
    }
}

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Taking marks input for different subjects
        System.out.print("Enter marks for Physics: ");
        double marksPhysics = inputScanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double marksChemistry = inputScanner.nextDouble();

        System.out.print("Enter marks for Mathematics: ");
        double marksMathematics = inputScanner.nextDouble();

        // Calculate total marks and percentage
        double totalObtainedMarks = marksPhysics + marksChemistry + marksMathematics; // Sum of marks
        double percentageScore = (totalObtainedMarks / 300) * 100; // Calculate percentage

        // Displaying the average marks and percentage
        double averageMarks = totalObtainedMarks / 3; // Calculate average marks
        System.out.println("Average Marks: " + averageMarks); // Print average marks
        System.out.println("Percentage: " + percentageScore + "%"); // Print percentage

        // Determine the grade and provide remarks based on percentage
        String grade = "";
        String comments = "";

        if (percentageScore >= 80) {
            grade = "A";
            comments = "Level 4, above agency-normalized standards";
        } else if (percentageScore >= 70) {
            grade = "B";
            comments = "Level 3, at agency-normalized standards";
        } else if (percentageScore >= 60) {
            grade = "C";
            comments = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentageScore >= 50) {
            grade = "D";
            comments = "Level 1, well below agency-normalized standards";
        } else if (percentageScore >= 40) {
            grade = "E";
            comments = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            comments = "Remedial standards";
        }

        // Displaying the calculated grade and corresponding remarks
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + comments);

        // Close the Scanner object to free up resources
        inputScanner.close();
    }
}

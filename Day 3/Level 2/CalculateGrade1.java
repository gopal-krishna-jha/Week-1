import java.util.*;

//Create class CalculateGrade1 to find grade of student
public class CalculateGrade1 {
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create a variable student and take input
        System.out.print("Enter the number of students: ");
        int student = input.nextInt();

        // Create a 2D array to store marks of the students in physics, chemistry, and
        // maths
        double[][] marks = new double[student][3];

        // Create arrays totalMarks,percentages,grades and remarks
        double[] totalMarks = new double[student];
        double[] percentages = new double[student];
        String[] grades = new String[student];
        String[] remarks = new String[student];

        // Taking input from user
        for (int i = 0; i < student; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Input Physics marks
            System.out.print("Physics: ");
            marks[i][0] = input.nextDouble();
            while (marks[i][0] < 0) {
                System.out.print("Marks cannot be negative. Enter positive value : ");
                marks[i][0] = input.nextDouble();
            }

            // Input Chemistry marks
            System.out.print("Chemistry: ");
            marks[i][1] = input.nextDouble();
            while (marks[i][1] < 0) {
                System.out.print("Marks cannot be negative. Enter positive value for Chemistry: ");
                marks[i][1] = input.nextDouble();
            }

            // Input Maths marks
            System.out.print("Maths: ");
            marks[i][2] = input.nextDouble();
            while (marks[i][2] < 0) {
                System.out.print("Marks cannot be negative. Enter positive value for Maths: ");
                marks[i][2] = input.nextDouble();
            }

            // Calculate total marks and percentage
            totalMarks[i] = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks[i] / 300) * 100;

            // Determine the grade and remarks based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        // Print the output
        System.out.println("\nResults:");
        for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
            System.out.println();
        }

        // Close input
        input.close();
    }
}

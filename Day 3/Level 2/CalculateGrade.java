import java.util.Scanner;

//Create class CalculateGrade to find grade of student
public class CalculateGrade {
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // create a veriavle student and take input
        System.out.print("Enter the number of students: ");
        int student = input.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        double[] physicsMarks = new double[student];
        double[] chemistryMarks = new double[student];
        double[] mathsMarks = new double[student];
        double[] totalMarks = new double[student];
        double[] percentages = new double[student];
        String[] grades = new String[student];
        String[] remarks = new String[student];

        // Taking input from user
        for (int i = 0; i < student; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Input Physics marks
            System.out.print("Physics: ");
            physicsMarks[i] = input.nextDouble();
            while (physicsMarks[i] < 0) {
                System.out.print("Marks cannot be negative. Enter positive value: ");
                physicsMarks[i] = input.nextDouble();
            }

            // Input Chemistry marks
            System.out.print("Chemistry: ");
            chemistryMarks[i] = input.nextDouble();
            while (chemistryMarks[i] < 0) {
                System.out.print("Marks cannot be negative. Enter positive value for Chemistry: ");
                chemistryMarks[i] = input.nextDouble();
            }

            // Input Maths marks
            System.out.print("Maths: ");
            mathsMarks[i] = input.nextDouble();
            while (mathsMarks[i] < 0) {
                System.out.print("Marks cannot be negative. Enter positive value for Maths: ");
                mathsMarks[i] = input.nextDouble();
            }

            // Perform operation to Calculate total marks and percentage
            totalMarks[i] = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks[i] / 300) * 100;

            // Find the grade and remarks
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
import java.util.*;

public class MaximumHandshakesCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking input.
        Scanner scanner = new Scanner(System.in);

        // create a variable named "numberOfStudents" for taking input of total number
        // of students
        System.out.print("Enter the total number of students: ");
        int numberOfStudents = scanner.nextInt();

        // create the variable named "Calculate" for calculating the maximum number of
        // handshakes.
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result.
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: "
                + maximumHandshakes);

        // Closing the scanner
        scanner.close();
    }
}

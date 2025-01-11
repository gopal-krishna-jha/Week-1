import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input for the year variable
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is >= 1582
        if (year >= 1582) {
            // Multiple if-else statements to check for Leap Year
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }

            // Single if statement with multiple logical conditions to check for Leap Year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Invalid year. The LeapYear program only works for years >= 1582.");
        }

        // Close the scanner
        scanner.close();
    }
}
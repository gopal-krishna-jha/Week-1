import java.util.*;

/*Create CheckLeapYear class to the Year is a Leap Year or not */
public class CheckLeapYear {

    // Create a static method isLeapYearOrNot to check if the year is a leap year
    public static boolean isLeapYearOrNot(int year) {
        if (year < 1582) {
            // to check year if year is less than 1582 than return false
            return false;
        }
        // A year is a leap year if it is divisible by 4 and not divisible by 100
        // OR it is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create a scanner class object to take input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year greater than 1582): ");
        int year = input.nextInt();

        // Check if the input year is valid or not
        if (year < 1582) {
            System.out.println("The LeapYear program only works for years >= 1582. Exiting.");
            System.exit(0);
        }

        // Create a variable leapYear to check if the year is a leap year
        boolean leapYear = isLeapYearOrNot(year);

        // Display the result
        if (leapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}

import java.util.*;

//Create a class DisplayCalendar to diaplay the calender
public class DisplayTheCalendar {

    // Create a static array to store month
    static String[] monthNames = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };

    // Create an array to store number of days in each month
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Create an method to check the year
    public static boolean isTheLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Create a method to get the first day of the month
    public static int getFirstDayOfMonth(int year, int month) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    public static void main(String[] args) {
        // create a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // create a variable and take input from user
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Update number of days in February for leap years
        if (isTheLeapYear(year)) {
            daysInMonth[1] = 29;
        } else {
            daysInMonth[1] = 28;
        }

        // Print the calender
        System.out.println("  " + monthNames[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Create a variable firstDay to store value and call a method
        int firstDay = getFirstDayOfMonth(year, month);

        // Print spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        int days = daysInMonth[month - 1];
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        input.close();
    }
}
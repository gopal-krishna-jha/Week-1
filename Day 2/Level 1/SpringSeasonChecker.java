import java.util.Scanner;

// Creating a class named SpringSeasonChecker 
public class SpringSeasonChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Check if the date falls within the spring season
        boolean isSpringSeason = (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20);

        // Output the result according to the specified format
        if (isSpringSeason) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the Scanner object
        scanner.close();
    }
}

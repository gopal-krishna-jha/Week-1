import java.util.Scanner;

// Creating a class named RocketLaunchCountdown indicating its purpose
public class RocketLaunchCountdown {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the starting value for the countdown
        System.out.print("Enter the starting value for the countdown: ");
        int counter = scanner.nextInt();

        // Use a for-loop to count down from the counter value to 1
        for (int i = counter; i > 0; i--) {
            // Print the current value of the counter
            System.out.println(i);
        }

        // Print the final message indicating the launch
        System.out.println("Liftoff!");

        // Close the Scanner object
        scanner.close();
    }
}

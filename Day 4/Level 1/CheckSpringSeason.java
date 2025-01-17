//Create a class CheckSpringSeason to check the Spring season
public class CheckSpringSeason {

    // Create a satic method to check the Spring season
    public static boolean springSeason(int month, int day) {
        // Check the spring season
        if (month == 3 && day >= 20 || month == 4 || month == 5 || month == 6 && day <= 20) {
            // return true if spring season
            return true;
        } else {
            // return false It's not a spring season
            return false;
        }
    }

    public static void main(String[] args) {
        // Check if the correct No of command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }

        // Take scanner using command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Create a variable result and call the method
        boolean result = springSeason(month, day);

        // Print the result
        if (result) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

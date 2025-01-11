public class DayOfWeek {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse the command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Calculate intermediate values
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate the day of the week (0 for Sunday, 1 for Monday, etc.)
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Print the day of the week
        System.out.println(d0);
    }
}

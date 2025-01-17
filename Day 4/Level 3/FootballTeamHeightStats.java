import java.util.Random;

public class FootballTeamHeightStats {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // Random height between 150 and 250 cm
        }

        // Display the heights of the players
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate the sum of the heights
        int sum = calculateSum(heights);

        // Calculate the mean height
        double mean = calculateMean(sum, heights.length);

        // Find the shortest height
        int shortest = findShortest(heights);

        // Find the tallest height
        int tallest = findTallest(heights);

        // Display the results
        System.out.printf("Sum of Heights: %d cm%n", sum);
        System.out.printf("Mean Height: %.2f cm%n", mean);
        System.out.printf("Shortest Height: %d cm%n", shortest);
        System.out.printf("Tallest Height: %d cm%n", tallest);
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }

    // Method to find the shortest height in the array
    public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < shortest) {
                shortest = array[i];
            }
        }
        return shortest;
    }

    // Method to find the tallest height in the array
    public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > tallest) {
                tallest = array[i];
            }
        }
        return tallest;
    }
}

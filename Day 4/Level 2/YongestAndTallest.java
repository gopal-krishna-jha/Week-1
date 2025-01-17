import java.util.Scanner;

// Create a class YongestAndTallestFriend to find youngest friend and tallest friend
public class YongestAndTallest {
    // Create a method youngest to find the youngest friend
    public static int youngest(int[] ages) {
        int youngestFriend = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestFriend]) {
                youngestFriend = i;
            }
        }
        return youngestFriend;
    }

    // Create a method tallest to find the tallest friend
    public static int tallest(double[] heights) {
        int tallestFriend = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestFriend]) {
                tallestFriend = i;
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        // Create a Scanner class object to take input from user
        Scanner input = new Scanner(System.in);

        // Create an integer array age to take user age
        int[] ages = new int[3];

        // Create an double array age to take user height
        double[] heights = new double[3];

        // Create an String array age to take user name
        String[] names = { "Amar", "Akbar", "Anthony" };

        // Use For Loop to take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + " in meters: ");
            heights[i] = input.nextDouble();
        }

        // Call a method Find the youngest and tallest friends
        int youngestFriend = youngest(ages);
        int tallestFriend = tallest(heights);

        // print the results
        System.out.println("The youngest friend is " + names[youngestFriend] + " with age " + ages[youngestFriend]);
        System.out.println( "The tallest friend is " + names[tallestFriend] + " with height " + heights[tallestFriend] + " meters");

        // scanner close
        input.close();
    }
}

import java.util.*;

//Create a class findMinAndMax to find the smallest and largest
public class findMinAndMax {
    // Create a static method to find smallest and largest No
    public static int[] findMinAndMax(int No1, int No2, int No3) {
        // create a variable smallest and largest to store value
        int smallest = No1;
        int largest = No1;

        // Find the smallest No
        if (No2 < smallest) {
            smallest = No2;
        }
        if (No3 < smallest) {
            smallest = No3;
        }
        // Find the smallest No
        if (No2 > largest) {
            largest = No2;
        }
        if (No3 > largest) {
            largest = No3;
        }

        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        // create a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // create variables No1, No2 and No3
        System.out.print("Enter the first No: ");
        int No1 = input.nextInt();
        System.out.print("Enter the second No: ");
        int No2 = input.nextInt();
        System.out.print("Enter the third No: ");
        int No3 = input.nextInt();

        // Create an array result to store the result and call a method
        int[] result = findMinAndMax(No1, No2, No3);

        // Print the result
        System.out.println("The smallest No is: " + result[0] + "\n The largest No is: " + result[1]);

        input.close();
    }

}

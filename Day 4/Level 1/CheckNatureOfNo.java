import java.util.*;

//Create class CheckNatureOfNumber to check the number
public class CheckNatureOfNo {
    // create a method checkNo to find simple interest
    public int checkNo(int number) {
        if (number > 0) {
            // If number is positive
            return 1;
        } else if (number < 0) {
            // If number is number
            return -1;
        } else {
            // If number is zero
            return 0;
        }
    }

    public static void main(String[] args) {
        // create a Scanner class object for scanner
        Scanner scanner = new Scanner(System.in);

        //// create variables to number and take scanner from user
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // create an object of CheckNatureOfNo class
        CheckNatureOfNo object = new CheckNatureOfNo();

        // Create a variables finalResult and Call the method to check the number
        int finalResult = object.checkNo(number);

        // Print the result
        if (finalResult == 1) {
            System.out.println("The number is positive.");
        } else if (finalResult == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

}

import java.util.Scanner;

//Create a class NumberChecker to check number even or not
public class CheckNumber {
    // Create a static method isPositive to check number is positive or not
    public static boolean isPositiveornot(int number) {
        return number >= 0;
    }

    // Create a static method isEven to check number even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Create a static method compare to compare a two number
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner class object to take input from user
        Scanner input = new Scanner(System.in);

        // Create an Integer array number to take user input
        int[] numbers = new int[5];

        // Use for loop to take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            // Check if the number is positive or negative
            if (isPositiveornot(numbers[i])) {
                // Check if the positive number is even or odd
                if (isEven(numbers[i])) {
                    System.out.println("Number " + (i + 1) + " is positive and even.");
                } else {
                    System.out.println("Number " + (i + 1) + " is positive and odd.");
                }
            } else {
                System.out.println("Number " + (i + 1) + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        // Create a variable compareNumber for store compare result
        int compareNumber = compare(numbers[0], numbers[numbers.length - 1]);
        if (compareNumber == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (compareNumber == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        // scanner object close
        input.close();
    }
}

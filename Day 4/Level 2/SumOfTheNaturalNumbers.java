import java.util.Scanner;

/*Create SumOfNaturalNumbers class to the sum of natural number through method and formula after both result are compare with is correct.*/
public class SumOfTheNaturalNumbers {

    // Craete Method isNaturalNumberOrNot to check number is natual or not
    public static boolean isNaturalNumberOrNot(int number) {
        return number > 0;
    }

    // Create recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumUsingRecursion(number - 1);
    }

    // Create Method to find the sum of n natural numbers using formula
    public static int sumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a scanner class object to take input
        Scanner input = new Scanner(System.in);

        // Create a variable number for taking user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural or number
        if (!isNaturalNumberOrNot(number)) {
            System.out.println("The input is not a natural number. Exiting.");
            System.exit(0);
        }

        // Craete a variable sumRecursion to store the calculating the sum using
        // recursion
        int sumRecursion = sumUsingRecursion(number);

        // Create a variable sumFormula to store the calculating the sum using formula
        int sumFormula = sumUsingFormula(number);

        // Comparing the both results and display the result
        System.out.println("Sum using recursion method : " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Both results are equal and correct.");
        } else {
            System.out.println("Both results are unequal.");
        }

        // scanner object close
        input.close();
    }
}

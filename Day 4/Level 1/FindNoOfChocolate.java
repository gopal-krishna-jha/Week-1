import java.util.*;

//Create a class FindNoOfChocolate to find the No of chocolates per child and remaining chocolates
public class FindNoOfChocolate {

    // Create a static method to find No of chocolates per child and remaining
    // chocolates
    public static int[] findRemainderAndQuotient(int No, int divisor) {
        // Create a variable quotient and find the quotient of No
        int quotient = No / divisor;

        // Create a variable remainder and find the remainder of No
        int remainder = No % divisor;

        return new int[] { quotient, remainder };

    }

    public static void main(String[] args) {
        // create a Scanner class object for input
        Scanner input = new Scanner(System.in);

        //// create variables No and take input from user
        System.out.print("Enter No of Chocolates: ");
        int NoOfChocolates = input.nextInt();
        System.out.print("Enter No of Children: ");
        int NoOfChildren = input.nextInt();

        // Create an array result to store the result and call a method
        int[] result = findRemainderAndQuotient(NoOfChocolates, NoOfChildren);

        // Print the result
        System.out.println("The Nos of Chocolates each child is: " + result[0]
                + "\nThe Nos of remaining Chocolates is: " + result[1]);

        input.close();
    }

}

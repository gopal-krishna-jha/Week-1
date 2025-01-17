import java.util.Scanner;

//Create a class FindquoAndrem to find the quo and rem
public class FindquoAndrem {

    // Create a static method to find quo and rem
    public static int[] findremAndquo(int No, int divisor) {
        // Create a variable quo and find the quo of No
        int quo = No / divisor;

        // Create a variable rem and find the rem of No
        int rem = No % divisor;

        return new int[] { quo, rem };

    }

    public static void main(String[] args) {
        // create a Scanner class object for input
        Scanner input = new Scanner(System.in);

        //// create variables to No and take input from user
        System.out.print("Enter No1: ");
        int No1 = input.nextInt();
        System.out.print("Enter No2: ");
        int No2 = input.nextInt();

        // Create an array result to store the result and call a method
        int[] result = findremAndquo(No1, No2);

        // Print the result
        System.out.println("The quo of Nos is: " + result[0] + "\nThe rem of Nos is: " + result[1]);

        input.close();
    }

}

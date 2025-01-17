import java.util.*;

//Create class FindSumOfNaturalNos to  calculate the natural No sum
public class FindSumOfNaturalNos {
    // create a method calculateSum to compute sum of natural No
    public int calculateSum(int No) {
        int sum = 0;
        for (int i = 1; i <= No; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //// create variables to No and take scanner from user
        System.out.print("Enter No: ");
        int No = scanner.nextInt();

        // create an object of FindSumOfNaturalNos class
        FindSumOfNaturalNos sumOfNatural = new FindSumOfNaturalNos();

        // create a variable sum and call the method
        int sum = sumOfNatural.calculateSum(No);

        // Print the result
        System.out.println("The sum of the first " + No + " natural Nos is: " + sum);
    }
}

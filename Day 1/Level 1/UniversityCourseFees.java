import java.util.*;

//Create UniversityCourseFee class for calculating Course fee of University
class UniversityCourseFee {
    public static void main(String[] args) {

        // Create a variable named "courseFee" and "discountPercentage" to indicate the
        // University course fee and discount
        int courseFee, discountPercentage;

        // Creating a Scanner object to take input from the user.
        Scanner input = new Scanner(System.in);

        // Taking details as input.
        System.out.print("Enter Course Fee in INR ");
        courseFee = input.nextInt();
        System.out.print("Enter Discount Percentage ");
        discountPercentage = input.nextInt();

        // Create a variable named "discountAmount" to indicate Amount of discount on
        // fee.
        int discountAmount = (courseFee * discountPercentage) / 100;

        // Create a variable named "finalCourseFee" to indicate Final Fee after
        // discount.
        int finalCourseFee = courseFee - discountAmount;

        // Print the Course Fee.
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalCourseFee);

    }
}

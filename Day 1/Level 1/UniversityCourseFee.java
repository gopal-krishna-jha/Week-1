import java.util.*;

class UniversityCourseFee {
    public static void main(String[] args) {

        // Create a variable named "courseFee" to indicate the University course fee.
        int courseFee = 125000;

        // Create a variable named "discountPercentage" to indicate the Discount
        // percent.
        int discountPercentage = 0;

        // Create a variable discountAmount to indicate Amount of discount on fee.
        int discountAmount = (courseFee * 10) / 100;

        // Create a variable named "finalCourseFee" to indicate Final Fee after
        // discount.
        int finalCourseFee = courseFee - discountAmount;

        // Print the Course Fee.
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalCourseFee);

    }
}

import java.util.Scanner;

public class TotalPurchasePriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking the input.
        Scanner scanner = new Scanner(System.in);

        // create a variable named "unitPrice".
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        // create a variable named "quantity".
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // create a variable named "totalPrice" for calculating total price.
        double totalPrice = unitPrice * quantity;

        // Output the result.
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity  " + quantity
                + " and unit price is INR " + unitPrice);

        // Closing the scanner.
        scanner.close();
    }
}
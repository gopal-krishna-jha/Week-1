import java.util.*;

class CalculatingTheProfitAndLoss {
    public static void main(String[] args) {

        // Create variables named "costPrice" and "sellingPrice" to indicate the Cost
        // Price and Selling Price
        int costPrice = 129, sellingPrice = 191;

        // Create a variable named "profit" to indicate Profit.
        int profit = sellingPrice - costPrice;

        // Create a variable named "profitPercent" to indicate Profit Percentage.
        float profitPercent = (float) (profit * 100) / costPrice;

        // Print the profit.
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice
                + "\n The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);

    }
}

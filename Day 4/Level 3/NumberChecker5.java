import java.util.*;

public class NumberChecker5 {

    public static void main(String[] args) {
        int number = 28; // Example number

        // Call the different methods and display the results
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        double productOfCubeOfFactors = productOfCubeOfFactors(factors);
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors);

        boolean isPerfect = isPerfectNumber(number, sumOfFactors);
        System.out.println("Is Perfect Number: " + isPerfect);

        boolean isAbundant = isAbundantNumber(number, sumOfFactors);
        System.out.println("Is Abundant Number: " + isAbundant);

        boolean isDeficient = isDeficientNumber(number, sumOfFactors);
        System.out.println("Is Deficient Number: " + isDeficient);

        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
    }

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array and return the
    // sum
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return
    // the product
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find product of cube of the factors using the factors array
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number, int sumOfFactors) {
        return sumOfFactors - number == number;
    }

    // Method to find if the number is an abundant number
    public static boolean isAbundantNumber(int number, int sumOfFactors) {
        return sumOfFactors - number > number;
    }

    // Method to find if the number is a deficient number
    public static boolean isDeficientNumber(int number, int sumOfFactors) {
        return sumOfFactors - number < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate the factorial of a digit
    public static int factorial(int digit) {
        if (digit == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
}

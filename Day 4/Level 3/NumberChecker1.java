
public class NumberChecker1 {

    public static void main(String[] args) {
        int number = 1523; // Example number

        // Call the different methods and display the results
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number, count);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sumOfDigits = sumDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        int sumOfSquares = sumSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies: ");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit: " + frequency[i][0] + ", Frequency: " + frequency[i][1]);
        }
    }

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the
    // digits array
    public static int sumSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using a digits array
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }
}

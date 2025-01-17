import java.util.*;

// Create a class RandomValueGenerator to generate five four digit random number
public class GenerateRandomValue {

    // Create a method generate4DigitRandomArray to generate random number
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Create a method findAverageMinMax to find average min and max
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Create a object analyzer of class RandomValueGenerator
        RandomValueGenerator analyzer = new RandomValueGenerator();

        // Create an integer array with name randomNumbers to store random number
        int[] randomNumbers = analyzer.generate4DigitRandomArray(5);

        // Print the random number
        System.out.println("Generated random numbers: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        double[] results = analyzer.findAverageMinMax(randomNumbers);
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}

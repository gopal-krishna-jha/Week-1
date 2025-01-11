import java.util.Scanner;

public class MatrixToSingleArray1 {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array (Matrix) with the specified number of rows and columns
        int[][] matrix = new int[rows][columns];

        // Take user input to fill the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] singleArray = new int[rows * columns];
        int index = 0; // Initialize index variable for the 1D array

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleArray[index] = matrix[i][j];
                index++;
            }
        }

        // Display the elements of the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.println("Element at index " + i + ": " + singleArray[i]);
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
import java.util.Scanner;

// Creating a class named IntOperation
public class IntOperation {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Prompt the user to enter the third integer
        System.out.print("Enter the third integer (c): ");
        int c = scanner.nextInt();

        // Perform the integer operations
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;

        // Output the results according to the specified format
        System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3
                + ", and " + operation4);

        // Close the Scanner object
        scanner.close();
    }
}
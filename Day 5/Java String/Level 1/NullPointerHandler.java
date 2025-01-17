// Define a class NullPointerHandler to generate and handle NullPointerException
public class NullPointerHandler {

    // Define a method to demonstrate and handle the NullPointerException
    public static void handleNullPointer(String inputString) {
        try {
            // Attempt to access the length of the string
            System.out.println(inputString.length());
        } catch (NullPointerException e) {
            // Handle the NullPointerException and provide feedback
            System.out.println("NullPointerException handled successfully.");
            System.out.println("Reason for the Exception: The string was initialized to null.");
        }
    }

    public static void main(String[] args) {
        // Declare a string variable and initialize it to null
        String nullableString = null;

        // Instantiate the NullPointerHandler class
        NullPointerHandler exceptionDemo = new NullPointerHandler();

        // Call the handleNullPointer method
        exceptionDemo.handleNullPointer(nullableString);
    }
}

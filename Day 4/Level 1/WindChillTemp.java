import java.util.Scanner;

//Create a class WindChillTemperatue to find the wind chill temp
public class WindChillTemp {

    // Create a static method to find wind chill temp
    public double calculateWindChill(double temp, double windSpeed) {

        // Create a variable result to store result
        double result = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);

        return result;

    }

    public static void main(String[] args) {
        // create a Scanner class object for input
        Scanner input = new Scanner(System.in);

        //// create variables number and take input from user
        System.out.print("Enter temp : ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed ");
        double windSpeed = input.nextDouble();

        // create an object of FindSumOfNaturalNumbers class
        WindChillTemperatue calculatetemp = new WindChillTemperatue();

        // Create an array result to store the result and call a method
        double windChillTemerature = calculatetemp.calculateWindChill(temp, windSpeed);

        // Print the result
        System.out.println("The Wind chill temp is: " + windChillTemerature);

        input.close();
    }

}

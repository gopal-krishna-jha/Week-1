import java.util.*;

//Create NoOfRounds class to Compute the No of rounds athletes complete
class NoOfRounds {
    public double FindNoOfRounds(double side1, double side2, double side3, double distance) {

        // Create a variable perimeter to indicate perimeter of triangular park
        double perimeter = side1 + side2 + side3;

        // Create a variable NoOfRounds to compute No of rounds
        double NoOfRounds = (distance * 1000) / perimeter;

        return NoOfRounds;
    }

    public static void main(String[] args) {
        // Creating Scanner object to take scanner from user
        Scanner scanner = new Scanner(System.in);

        // create variable side1, side2 and side3 to store length of sides and distance
        // to run
        double side1, side2, side3, distance = 5;

        // Taking details as scanner from user
        System.out.print("Enter length of side1 in meters: ");
        side1 = scanner.nextDouble();
        System.out.print("Enter length of side2 in meters: ");
        side2 = scanner.nextDouble();
        System.out.print("Enter length of side3 in meters: ");
        side3 = scanner.nextDouble();

        // create an object of FindNoOfRounds class
        NoOfRounds NoOfRounds = new NoOfRounds();

        // Create a variable rounds to store value
        double rounds = NoOfRounds.FindNoOfRounds(side1, side2, side3, distance);

        // Print the No Of Rounds
        System.out.println("The total No of rounds the athlete will run is " + rounds + " to complete 5 km");

        scanner.close();
    }
}

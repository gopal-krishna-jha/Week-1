import java.util.*;

//Create class FindSimpleInterest  to  calculate simpleInterest
public class FindSimpleInterest {
	// create a method simpleInterest to find simple interest
	public double calulateSimpleInterest(int principal, double rate, double time) {
		double simpleInterest = (principal * rate * time) / 100;
		return simpleInterest;
	}

	public static void main(String[] args) {

		// create a Scanner class object for scanner
		Scanner scanner = new Scanner(System.in);

		// create variables to principal, rate and time and take scanner
		System.out.print("Enter the principal amount: ");
		int principal = scanner.nextInt();
		System.out.print("Enter the Rate of interest: ");
		double rate = scanner.nextDouble();
		System.out.print("Enter the time in years: ");
		double time = scanner.nextDouble();

		// create an object of FindSimpleInterest class
		FindSimpleInterest object = new FindSimpleInterest();

		// call the method to find the simpleInterest
		double simpleInterest = object.calulateSimpleInterest(principal, rate, time);

		// Print the result
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
				+ ", Rate of Interest " + rate + " and Time " + time);

	}

}

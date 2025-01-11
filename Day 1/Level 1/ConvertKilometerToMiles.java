import java.util.*;
//Create ConvertKilometerToMile class to convert kilometers to miles 
class ConvertKilometerToMile{
 public static void main(String[] args){
	
	 //Create a variable named "kilometers" to indicate distance in Kilometers.
     double kilometers ; 
	 
	 // Creating a Scanner object to take input from the user.
	 Scanner input = new Scanner(System.in);
	 
	 // Taking user contact details as input.
     System.out.print("Enter Distance in Kilometers: ");
	 kilometers = input.nextDouble();
	 
	 // Create a variable named "miles" to indicate distance in Miles.
	 double miles = kilometers / 1.6; //1 mile = 1.6 km
	
	 //Print the result.
	 System.out.println("The distance "+ kilometers +" km in miles is " + miles);
	 
 }
}

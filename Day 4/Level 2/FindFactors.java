import java.util.Scanner;

/*Create FactorsFinder class to find the factors of a number taken as user input, store the factors in an array, and display the factors*/
public class FindFactors {
    public static int[] findTheFactors(int number){
	   //Create a variable count to count the factore
	   int count=0;
	   
	   // for loop to count the factors of number
	   for(int i=1;i<=number;i++){
	      if(number%i==0){
	      count++;
		  }
	   }
	   
	   //Create a array with name factors for storing factore
	   int []factors=new int[count];
	   
	   int temp=1;
	   // for loop to store the factors in the array
	   for(int i=0;i<count;i++){
	    for(int j=temp;j<=number;j++){
	      if(number%j==0){
	      factors[i]=j;
		  temp=j+1;
		  break;
		  }
		}
	   }
	   //return the array
	   return factors;
	   
	}
	
	//Create a method sumCalculate to calculate factors sum
	public int sumCalculate(int []factors){
		int sum=0;
	   for(int i=0;i<factors.length;i++){
	       sum=sum+factors[i];
	   } 
	   return sum;
	}
	
	//Create a method prodCalculate to calculate the prod of a number
	public int prodCalculate(int []factors){
		int prod=1;
	   for(int i=0;i<factors.length;i++){
	       prod=prod*factors[i];
	   } 
	   return prod;
	}
	
	//Create a method sumSquare to find the square of a number
	public double sumSquare(int sum){
	   double sumOfSquare=Math.pow(sum,2);
	   return sumOfSquare;
	}
	
    public static void main(String[] args) {
        // Create a Scanner class object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable number to take input from the user
        System.out.print("Enter a integer: ");
        int number = input.nextInt();
        
		// Create a object obj of FactorsFinder class
		FactorsFinder obj=new FactorsFinder();
		
		//Create a factors array to store a return a array
		int []factors=FactorsFinder.findTheFactors(number);
         
		//Now call method sum pass argument array
		int sum=obj.sumCalculate(factors);
		
		//Now call method prodCalculate pass argument array
		int prod=obj.prodCalculate(factors);
		
		//Now call method sumSquare pass argument array
		double sumOfSquare=obj.sumSquare(sum);
		
		// Displaying the factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); // for next line 
		
		//Display the result like sum of factors, prod of factors and square of sum
		System.out.print("The sum of factors is "+sum+". prod of factors is "+prod+" and Square of the sum is "+sumOfSquare);
        
		// the scanner close
        input.close();
    }
}

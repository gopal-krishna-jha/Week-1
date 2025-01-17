import java.util.*;

//Create FindMaximumHandshakes class to compute Maximum No of Handshakes 
public class FindMaxHandshakes {
    // create a method maximumHandshakes to find No of handshakes
    public int maximumHandshakes(int NoOfStudents) {
        return (int) ((NoOfStudents * (NoOfStudents - 1)) / 2);
    }

    public static void main(String[] args) {
        // create a Scanner class object for scanner
        Scanner scanner = new Scanner(System.in);

        // create a variable NoOfStudents to store No of students
        int totalStudent;

        // Taking No of Students as scanner
        System.out.print("Enter the No of students: ");
        totalStudent = scanner.nextInt();

        // create an object of FindMaximumHandshakes class
        FindMaxHandshakes FindHandshakes = new FindMaxHandshakes();

        // create the variable NoOfHandshakes to store value
        int NoOfHandshakes = FindHandshakes.maximumHandshakes(totalStudent);

        // Print the output
        System.out.println("The maximum No of possible handshakes among " + totalStudent + " students is: "
                + NoOfHandshakes);

        scanner.close();
    }
}

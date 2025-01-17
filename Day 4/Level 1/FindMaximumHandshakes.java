import java.util.*;

//Create FindMaximumHandshakes class to compute Maximum No of Handshakes among students
public class FindMaximumHandshakes {
    // create a method maximumHandshakes to find No of handshakes
    public int maximumHandshakes(int NoOfStudents) {
        return (int) ((NoOfStudents * (NoOfStudents - 1)) / 2);
    }

    public static void main(String[] args) {
        // create a Scanner class object for scanner
        Scanner scanner = new Scanner(System.in);

        // create a variable NoOfStudents to store No of students
        int NoOfStudents;

        // Taking No of Students as scanner
        System.out.print("Enter the No of students: ");
        NoOfStudents = scanner.nextInt();

        // create an object of FindMaximumHandshakes class
        FindMaximumHandshakes FindHandshakes = new FindMaximumHandshakes();

        // create the variable NoOfHandshakes to store value
        int NoOfHandshakes = FindHandshakes.maximumHandshakes(NoOfStudents);

        // Print the output of the problem
        System.out.println("The maximum No of possible handshakes among " + NoOfStudents + " students is: "
                + NoOfHandshakes);

        scanner.close();
    }
}

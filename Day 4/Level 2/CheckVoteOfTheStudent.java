import java.util.Scanner;

//Create a class CheckStudentVote to take student age and check student can do vote or not
public class CheckVoteOfTheStudent  {
    // Create a mehtod canStudentVote to check student can do vote or not
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create a Scanner class object to take input from user
        Scanner input = new Scanner(System.in);

        // Create integer array studentAges to store students ages
        int[] studentAges = new int[10];

        // create a CheckStudentVote class object for class a method
        Checkthevote voteCheckerObject = new Checkthevote();

        // For Loop to take user input from user
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Please enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            // Check student can vote or not
            if (voteCheckerObject.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        // scanner object close
        input.close();
    }
}

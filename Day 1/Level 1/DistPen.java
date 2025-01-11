import java.util.*;

class DistPen {
    public static void main(String[] args) {

        // Create a variable named "totalPens" to indicate the Total number of pens
        int totalPens = 14;

        // Create a variable named "student" to indicate the number of student
        int student = 3;

        // Create a variable named "penPerStudent" to indicate number pens per student
        int penPerStudent = totalPens / student;

        // Create a variable named "remainingPens" to indicate number of remaining pens
        int remainingPens = totalPens % student;

        // Print the profit.
        System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is "
                + remainingPens);

    }
}

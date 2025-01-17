//Create a class UnitConvertsioner2 to Convertsion one unit to another unit
public class ConvertsionerTheUnit1 {

    // Create a static final variables to store Convertsionion values
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Create a method ConvertsionYardsToFeet to Convertsion yards to feet
    public static double ConvertsionYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Create a method ConvertsionFeetToYards to Convertsion feet to yards
    public static double ConvertsionFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Create a method ConvertsionMetersToInches to Convertsion meters to inches
    public static double ConvertsionMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Create a method ConvertsionInchesToMeters to Convertsion inches to meters
    public static double ConvertsionInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Create a method ConvertsionInchesToCm to Convertsion inches to centimeters
    public static double ConvertsionInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    public static void main(String[] args) {
        // Example for unit Convertsionion
        double yards = 2.0;
        double feetFromYards = ConvertsionYardsToFeet(yards);
        System.out.println(yards + " yards = " + feetFromYards + " feet.");

        // Example for unit Convertsionion
        double feet = 9.0;
        double yardsFromFeet = ConvertsionFeetToYards(feet);
        System.out.println(feet + " feet = " + yardsFromFeet + " yards.");

        // Example for unit Convertsionion
        double meters = 3.0;
        double inchesFromMeters = ConvertsionMetersToInches(meters);
        System.out.println(meters + " meters = " + inchesFromMeters + " inches.");

        // Example for unit Convertsionion
        double inches = 20.0;
        double metersFromInches = ConvertsionInchesToMeters(inches);
        System.out.println(inches + " inches = " + metersFromInches + " meters.");

        // Example for unit Convertsionion
        double inchesValue = 15.0;
        double centimetersFromInches = ConvertsionInchesToCm(inchesValue);
        System.out.println(inchesValue + " inches = " + centimetersFromInches + " centimeters.");
    }
}


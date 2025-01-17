//Create a class ConvertsionTheUnit to Convertsion one unit to another unit
public class ConvertsionTheUnit {

    // Create a static final variables to store Convertsionion values
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    // Create a method ConvertsionKmToMiles to Convertsion kilometers to miles
    public static double ConvertsionKmToMiles(double kilometers) {
        return kilometers * KM_TO_MILES;
    }

    // Create a method ConvertsionMilesToKm to Convertsion miles to kilometers
    public static double ConvertsionMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Create a method ConvertsionMetersToFeet to Convertsion meters to feet
    public static double ConvertsionMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Create a method ConvertsionFeetToMeters to Convertsion feet to meters
    public static double ConvertsionFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
        // Example for unit Convertsionion
        double kilometers = 10.0;
        double miles = ConvertsionKmToMiles(kilometers);
        System.out.println(kilometers + " kilometers = " + miles + " miles.");

        // Example for unit Convertsionion
        double milesValue = 6.2;
        double kilometersConvertsioned = ConvertsionMilesToKm(milesValue);
        System.out.println(milesValue + " miles = " + kilometersConvertsioned + " kilometers.");

        // Example for unit Convertsionion
        double meters = 5.0;
        double feet = ConvertsionMetersToFeet(meters);
        System.out.println(meters + " meters = " + feet + " feet.");

        // Example for unit Convertsionion
        double feetValue = 16.4;
        double metersConvertsioned = ConvertsionFeetToMeters(feetValue);
        System.out.println(feetValue + " feet = " + metersConvertsioned + " meters.");
    }
}

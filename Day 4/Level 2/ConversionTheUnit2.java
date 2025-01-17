//Create a class UnitConverter3 to convert one unit to another unit
public class ConversionTheUnit2 {

    // Create a method convertFahrenheitToCelsius to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Create a method convertCelsiusToFahrenheit to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Create a method convertPoundsToKilograms to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Create a method convertKilogramsToPounds to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Create a method convertGallonsToLiters to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Create a method convertLitersToGallons to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Example for unit convertion
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius.");

        // Example for unit convertion
        double celsiusValue = 37.0;
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + " Celsius = " + fahrenheitConverted + " Fahrenheit.");

        // Example for unit convertion
        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds = " + kilograms + " kilograms.");

        // Example for unit convertion
        double kilogramsValue = 68.0;
        double poundsConverted = convertKilogramsToPounds(kilogramsValue);
        System.out.println(kilogramsValue + " kilograms = " + poundsConverted + " pounds.");

        // Example for unit convertion
        double gallons = 5.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        // Example for unit convertion
        double litersValue = 10.0;
        double gallonsConverted = convertLitersToGallons(litersValue);
        System.out.println(litersValue + " liters is equal to " + gallonsConverted + " gallons.");
    }
}

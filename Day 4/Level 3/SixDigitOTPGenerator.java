import java.util.*;

// Create a class SixDigitOTPGenerator to generate a unique 6 digit otp
public class SixDigitOTPGenerator {

    // Create a static method generate6DigitOTP to generate a 6-digit OTP number
    public static String generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }

    // Create a static method generate10OTPs to generate 10 OTP numbers and store
    // them in an string array
    public static String[] generateOTPs(int count) {

        // Create a String array to store otps
        String[] otps = new String[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Create a static method to check otp are same or not
    public static boolean checkOTPSameOrNot(String[] otps) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (otps[i].equalsIgnoreCase(otps[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a String array to store 6 digits otp and and call the method
        String[] otps = generateOTPs(10);

        // Display the generate otps
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        // Create a variable result to store unique boolean value if otp is same store
        // false otherwise store true
        boolean result = checkOTPSameOrNot(otps);

        // Display the result
        System.out.println("OTPs are unique: " + result);
    }
}
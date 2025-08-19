import java.util.Arrays;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        
        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i+1) + ": " + otpArray[i]);
        }
        
        // Validate uniqueness
        boolean areUnique = validateUniqueness(otpArray);
        System.out.println("\nAll OTPs are unique: " + areUnique);
    }
    
    // Generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() gives 0.0 <= x < 1.0
        // So we multiply by 900000 to get 0 <= x < 900000
        // Then add 100000 to get 100000 <= x < 1000000 (6-digit)
        return (int)(Math.random() * 900000) + 100000;
    }
    
    // Validate all OTPs are unique
    public static boolean validateUniqueness(int[] otps) {
        // Sort the array to easily find duplicates
        Arrays.sort(otps);
        
        // Check adjacent elements for duplicates
        for (int i = 0; i < otps.length - 1; i++) {
            if (otps[i] == otps[i+1]) {
                return false;
            }
        }
        return true;
    }
}











//OUTPUT ->
// OTP 1: 402730
// OTP 2: 922781
// OTP 3: 598631
// OTP 4: 792542
// OTP 5: 334091
// OTP 6: 818601
// OTP 7: 647723
// OTP 8: 962861
// OTP 9: 404668
// OTP 10: 271870

// All OTPs are unique: true
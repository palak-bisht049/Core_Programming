import java.util.Arrays;

public class NumberChecker_1 {
    public static void main(String[] args) {
        int number = 1530;
        System.out.println("Analyzing number: " + number);
        
        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);
        
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squared digits: " + sumSquaredDigits(digits));
        System.out.println("Is Harshad number: " + isHarshad(number, digits));
        
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] entry : frequency) {
            if (entry[1] > 0) {
                System.out.println(entry[0] + ": " + entry[1]);
            }
        }
    }
    
    // Count digits in number
    public static int countDigits(int num) {
        return num == 0 ? 1 : (int)Math.log10(Math.abs(num)) + 1;
    }
    
    // Store digits in array
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count-1; i >= 0; i--, num /= 10) {
            digits[i] = num % 10;
        }
        return digits;
    }
    
    // Sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    
    // Sum of squared digits
    public static double sumSquaredDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    
    // Check Harshad number
    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }
    
    // Digit frequency
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // Digit
            freq[i][1] = 0; // Count
        }
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}










//OUTPUT ->
// Analyzing number: 1530
// Digit count: 4
// Digits: [1, 5, 3, 0]
// Sum of digits: 9
// Sum of squared digits: 35.0
// Is Harshad number: true
// Digit frequencies:
// 0: 1
// 1: 1
// 3: 1
// 5: 1
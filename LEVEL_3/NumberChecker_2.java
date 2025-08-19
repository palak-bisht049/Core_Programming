import java.util.Arrays;

public class NumberChecker_2 {
    public static void main(String[] args) {
        int number = 12321;
        int[] digits = getDigits(number);
        
        System.out.println("Number: " + number);
        System.out.println("Digit count: " + digits.length);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed: " + Arrays.toString(reversed));
        
        System.out.println("Is palindrome: " + isPalindrome(digits));
        System.out.println("Is duck number: " + isDuckNumber(digits));
        
        int[] compareNum = {1, 2, 3, 2, 1};
        System.out.println("Arrays equal: " + areArraysEqual(digits, compareNum));
    }

    // Get digits array and count
    public static int[] getDigits(int num) {
        if (num == 0) return new int[]{0};
        int len = (int)Math.log10(Math.abs(num)) + 1;
        int[] digits = new int[len];
        for (int i = len-1; i >= 0; i--, num /= 10) {
            digits[i] = num % 10;
        }
        return digits;
    }

    // Reverse digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length-1-i];
        }
        return reversed;
    }

    // Check if arrays are equal
    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Check palindrome
    public static boolean isPalindrome(int[] digits) {
        for (int i = 0; i < digits.length/2; i++) {
            if (digits[i] != digits[digits.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    // Check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }
}









//OUTPUT ->
// Number: 12321
// Digit count: 5
// Digits: [1, 2, 3, 2, 1]
// Reversed: [1, 2, 3, 2, 1]
// Is palindrome: true
// Is duck number: true
// Arrays equal: true
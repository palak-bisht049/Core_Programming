import java.util.Arrays;

public class NumberChecker {
    public static void main(String[] args) {
        int num = 1530;
        int[] digits = getDigits(num);
        
        System.out.println("Number: " + num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck number: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(digits));
        System.out.println("Largest two: " + Arrays.toString(getLargestTwo(digits)));
        System.out.println("Smallest two: " + Arrays.toString(getSmallestTwo(digits)));
    }

    static int[] getDigits(int num) {
        int len = (int) Math.log10(num) + 1;
        int[] digits = new int[len];
        for (int i = len-1; i >= 0; i--, num /= 10) 
            digits[i] = num % 10;
        return digits;
    }

    static boolean isDuck(int[] d) {
        for (int i = 1; i < d.length; i++)
            if (d[i] != 0) return true;
        return false;
    }

    static boolean isArmstrong(int[] d) {
        int sum = 0, pow = d.length;
        for (int n : d) sum += Math.pow(n, pow);
        return sum == toNumber(d);
    }

    static int[] getLargestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = first;
        for (int n : d) {
            if (n > first) { second = first; first = n; } 
            else if (n > second) second = n;
        }
        return new int[]{first, second};
    }

    static int[] getSmallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = first;
        for (int n : d) {
            if (n < first) { second = first; first = n; } 
            else if (n < second) second = n;
        }
        return new int[]{first, second};
    }

    static int toNumber(int[] d) {
        int num = 0;
        for (int n : d) num = num * 10 + n;
        return num;
    }
}








//OUTPUT ->
// Number: 1530
// Digits: [1, 5, 3, 0]
// Duck number: true
// Armstrong: false
// Largest two: [5, 3]
// Smallest two: [0, 1]
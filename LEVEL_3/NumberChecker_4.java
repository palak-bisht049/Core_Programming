import java.util.Arrays;

public class NumberChecker_4 {
    public static void main(String[] args) {
        int number = 28;
        
        // Get all factors
        int[] factors = getFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        
        // Various factor operations
        System.out.println("Greatest factor: " + getGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cubed factors: " + productCubedFactors(factors));
        
        // Number property checks
        System.out.println("Is perfect number: " + isPerfectNumber(number));
        System.out.println("Is abundant number: " + isAbundantNumber(number));
        System.out.println("Is deficient number: " + isDeficientNumber(number));
        System.out.println("Is strong number: " + isStrongNumber(number));
    }
    
    // Get all factors of a number (excluding the number itself)
    public static int[] getFactors(int num) {
        // First pass: count factors
        int count = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) count++;
        }
        
        // Second pass: store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }
    
    // Find greatest factor
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) max = factor;
        }
        return max;
    }
    
    // Sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }
    
    // Product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }
    
    // Product of cubed factors
    public static double productCubedFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) product *= Math.pow(factor, 3);
        return product;
    }
    
    // Perfect number check
    public static boolean isPerfectNumber(int num) {
        return sumFactors(getFactors(num)) == num;
    }
    
    // Abundant number check
    public static boolean isAbundantNumber(int num) {
        return sumFactors(getFactors(num)) > num;
    }
    
    // Deficient number check
    public static boolean isDeficientNumber(int num) {
        return sumFactors(getFactors(num)) < num;
    }
    
    // Strong number check
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return sum == original;
    }
    
    // Helper method for factorial calculation
    private static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

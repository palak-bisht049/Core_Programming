public class NumberChecker_3 {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(num + " is prime: " + isPrime(num));
        System.out.println(num + " is neon: " + isNeon(num));
        System.out.println(num + " is spy: " + isSpy(num));
        System.out.println(num + " is automorphic: " + isAutomorphic(num));
        System.out.println(num + " is buzz: " + isBuzz(num));
    }

    // Prime number check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // Neon number check
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    // Spy number check
    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Automorphic number check
    public static boolean isAutomorphic(int n) {
        long square = (long)n * n;
        while (n > 0) {
            if (n % 10 != square % 10) return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }

    // Buzz number check
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}










//OUTPUT->
// 7 is prime: true
// 7 is neon: false
// 7 is spy: true
// 7 is automorphic: false
// 7 is buzz: true

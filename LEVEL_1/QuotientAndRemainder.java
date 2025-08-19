
import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calling method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }

    // Method to find quotient and remainder of number/divisor
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] {quotient, remainder};
    }
}






//OUTPUT->
// Enter the number: 10
// Enter the divisor: 5
// Quotient: 2
// Remainder: 0


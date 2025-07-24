import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        
        System.out.print("Enter first number (dividend): ");
        number1 = sc.nextInt();
        System.out.print("Enter second number (divisor): ");
        number2 = sc.nextInt();
        
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}




//OUTPUT ->

// Enter first number (dividend): 45
// Enter second number (divisor): 2
// Quotient: 22
// Remainder: 1
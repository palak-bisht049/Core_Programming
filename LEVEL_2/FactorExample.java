import java.util.Scanner;

public class FactorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;
        double sumSquares = 0;

        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
                product *= i;
                sumSquares += Math.pow(i, 2);
            }
        }

        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);

        sc.close();
    }
}







//OUTPUT ->
// Enter a number: 6
// Factors: 1 2 3 6 
// Sum of factors: 12
// Product of factors: 36
// Sum of squares of factors: 50.0

import java.util.Scanner;

public class SumNaturalNumbers {

   
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // add current number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int result = sumOfNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive integer greater than 0.");
        }

        scanner.close();
    }
}







//OUTPUT ->
// Enter a positive integer n: 8
// Sum of first 8 natural numbers is: 36
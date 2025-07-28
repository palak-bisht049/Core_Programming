import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println(sum == formulaSum ? "Both match." : "Mismatch!");
        }
        sc.close();
    }
}

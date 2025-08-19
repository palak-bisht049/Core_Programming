import java.util.Scanner;

public class NaturalNumberSumEasy {
    static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int sum1 = recursiveSum(n);
            int sum2 = formulaSum(n);
            System.out.println("Sum using recursion: " + sum1);
            System.out.println("Sum using formula: " + sum2);
        }

        sc.close();
    }
}










//OUTPUT->
// Enter a natural number: 45
// Sum using recursion: 1035
// Sum using formula: 1035
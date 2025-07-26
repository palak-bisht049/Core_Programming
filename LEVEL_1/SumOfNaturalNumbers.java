import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (positive integer).");
        } else {
            int sumLoop = 0;
            int counter = 1;

            while (counter <= n) {
                sumLoop += counter;
                counter++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println("Both results are correct and match.");
            } else {
                System.out.println("Mismatch in results!");
            }
        }

        scanner.close();
    }
}

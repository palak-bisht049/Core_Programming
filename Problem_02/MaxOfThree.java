import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = input(scanner, "Enter first number: ");
        int b = input(scanner, "Enter second number: ");
        int c = input(scanner, "Enter third number: ");
        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    static int input(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}

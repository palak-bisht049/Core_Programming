import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The first number is the largest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The second number is the largest.");
        } else {
            System.out.println("The third number is the largest.");
        }
    }
}

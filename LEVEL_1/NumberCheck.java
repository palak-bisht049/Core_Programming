
import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();

        int result = checkNumber(inputNumber);

        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}








//OUTPUT ->
// Enter a number: 34
// The number is Positive


import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++)
            System.out.println(i + (i % 2 == 0 ? " is even" : " is odd"));
    }
}

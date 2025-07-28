import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[10];

        for (int i = 0; i < 10; i++)
            table[i] = number * (i + 1);

        for (int i = 0; i < 10; i++)
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
    }
}







//OUTPUT ->
// 9
// 9 * 1 = 9
// 9 * 2 = 18
// 9 * 3 = 27
// 9 * 4 = 36
// 9 * 5 = 45
// 9 * 6 = 54
// 9 * 7 = 63
// 9 * 8 = 72
// 9 * 9 = 81
// 9 * 10 = 90
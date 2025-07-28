import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int e = 0, o = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < e; i++) System.out.print(even[i] + " ");
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");
    }
}






//OUTPUT ->
// 10
// Even numbers: 2 4 6 8 10 
// Odd numbers: 1 3 5 7 9 
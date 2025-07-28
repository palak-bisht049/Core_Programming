import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxSize = 10, index = 0;
        int[] factors = new int[maxSize];

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    for (int j = 0; j < index; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");
    }
}







//OUTPUT ->
// 89
// Factors: 1 89 

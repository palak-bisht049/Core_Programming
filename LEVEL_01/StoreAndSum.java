import java.util.Scanner;
public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double value = sc.nextDouble();
            if (value <= 0 || index == 10) break;
            arr[index++] = value;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("Sum = " + total);
    }
}









//OUTPUT ->
// 4.5
// 6.7
// 2.3
// -1
// 4.5
// 6.7
// 2.3
// Sum = 13.5
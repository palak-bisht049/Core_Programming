import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.println("Mean height = " + mean);
    }
}






// OUTPUT ->
// 170.6 234.6 35.6 345.1 69.3 
// 234.6 2.3 56.23 12.8 9.0
// 45.6
// Mean height = 110.52090909090907

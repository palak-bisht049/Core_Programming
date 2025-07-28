import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[index++] = matrix[i][j];

        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}











//OUTPUT->

// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 1D Array: 1 2 3 4 5 6 7 8 9 
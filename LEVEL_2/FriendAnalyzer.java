import java.util.Scanner;

public class FriendAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + friends[i] + "'s age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter " + friends[i] + "'s height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("\nYoungest friend: " + friends[findYoungest(ages)]);
        System.out.println("Tallest friend: " + friends[findTallest(heights)]);
    }

    // Method to find youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find tallest friend
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
}







//OUTPUT ->
// Enter Amar's age: 45
// Enter Amar's height (in cm): 175
// Enter Akbar's age: 42
// Enter Akbar's height (in cm): 167
// Enter Anthony's age: 44
// Enter Anthony's height (in cm): 181

// Youngest friend: Akbar
// Tallest friend: Anthony
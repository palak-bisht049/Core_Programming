import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();

        for (int n : nums) {
            if (n > 0)
                System.out.println(n % 2 == 0 ? "Positive Even" : "Positive Odd");
            else if (n < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }

        if (nums[0] == nums[4])
            System.out.println("First and Last elements are Equal");
        else if (nums[0] > nums[4])
            System.out.println("First element is Greater");
        else
            System.out.println("Last element is Greater");
    }
}






//OUTPUT->
// 7 -3 0 2 1
// Positive Odd
// Negative
// Zero
// Positive Even
// Positive Odd
// First element is Greater
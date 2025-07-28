import java.util.Scanner;
public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++)
            age[i] = sc.nextInt();

        for (int a : age) {
            if (a < 0)
                System.out.println("Invalid age");
            else if (a >= 18)
                System.out.println("The student with the age " + a + " can vote.");
            else
                System.out.println("The student with the age " + a + " cannot vote.");
        }
    }
}






//OUTPUT ->
// 12 34 45 56 0 -90 56 12 2 4
// The student with the age 12 cannot vote.
// The student with the age 34 can vote.
// The student with the age 45 can vote.
// The student with the age 56 can vote.
// The student with the age 0 cannot vote.
// Invalid age
// The student with the age 56 can vote.
// The student with the age 12 cannot vote.
// The student with the age 2 cannot vote.
// The student with the age 4 cannot vote.
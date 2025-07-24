import java.util.Scanner;

public class SamAveragePCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        double average = (math + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is: " + average);
    }
}






//OUTPUT->

// Enter marks in Math: 50
// Enter marks in Physics: 80
// Enter marks in Chemistry: 99
// Sam's average mark in PCM is: 76.33333333333333
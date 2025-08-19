// package LEVEL_1;
import java.util.Scanner;

public class Handshake {

    public static int Handshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = Handshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}

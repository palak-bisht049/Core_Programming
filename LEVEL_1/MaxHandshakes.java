import java.util.Scanner;

public class MaxHandshakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numberOfStudents: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of possible handshakes: " + handshakes);

        sc.close();
    }
}





//OUTPUT ->
// Enter numberOfStudents: 56
// Maximum number of possible handshakes: 1540


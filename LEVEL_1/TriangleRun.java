
import java.util.Scanner;

public class TriangleRun {

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // in meters
        double totalDistance = 5000; // 5 km in meters
        return (int) Math.ceil(totalDistance / perimeter); // round up to full rounds
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        sc.close();
    }
}









//OUTPUT->

// Enter side 1 of the triangle (in meters): 45
// Enter side 2 of the triangle (in meters): 60
// Enter side 3 of the triangle (in meters): 50
// The athlete needs to complete 33 rounds to run 5 km.
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("Distance in Yards: " + yards);
        System.out.println("Distance in Miles: " + miles);
    }
}


//OUTPUT ->

// Enter distance in feet: 45
// Distance in Yards: 15.0
// Distance in Miles: 0.008522727272727272
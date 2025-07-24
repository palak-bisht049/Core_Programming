import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet;
        
        System.out.print("Enter distance in feet: ");
        feet = sc.nextDouble();
        
        double yards = feet / 3;
        double miles = feet / 5280;
        
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);
    }
}



//OUTPUT ->

// Enter distance in feet: 45
// Distance in yards: 15.0
// Distance in miles: 0.008522727272727272


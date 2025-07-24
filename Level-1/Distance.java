import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        
        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();  
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
    }
}



//OUTPUT ->

// Enter distance in kilometers: 456
// The total miles is 285.0 mile for the given 456.0 km.

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter;
        
        System.out.print("Enter perimeter of the square: ");
        perimeter = sc.nextDouble();
        
        double side = perimeter / 4;
        double area = side * side;
        
        System.out.println("Side of the square: " + side);
        System.out.println("Area of the square: " + area);
    }
}



//OUTPUT ->

// Enter perimeter of the square: 45
// Side of the square: 11.25
// Area of the square: 126.5625

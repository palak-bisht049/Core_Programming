import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        c = sc.nextDouble();
        
        double result1 = a + b * c;
        double result2 = a + b + c / a / b;
        double result3 = a % b + c;
        
        System.out.println("The results of Double operations are: " + result1 + ", " + result2 + ", and " + result3);
    }
}





//OUTPUT ->

// Enter value of a: 5
// Enter value of b: 6
// Enter value of c: 8
// The results of Double operations are: 53.0, 11.266666666666667, and 13.0
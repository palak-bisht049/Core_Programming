import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;

        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();
        System.out.print("Enter value of c: ");
        c = sc.nextInt();
        
        int result1 = a + b * c;
        int result2 = a + b + c / a / b;
        int result3 = a % b + c;
        
        System.out.println("The results of Int operations are: " + result1 + ", " + result2 + ", and " + result3);
    }
}




//OUTPUT ->

// Enter value of a: 56
// Enter value of b: 24
// Enter value of c: 89
// The results of Int operations are: 2192, 80, and 97
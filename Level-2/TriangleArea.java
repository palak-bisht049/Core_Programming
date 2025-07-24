import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height;
        
        System.out.print("Enter base in inches: ");
        base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        height = sc.nextDouble();
        
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; // 1 inch² = 6.4516 cm²
        
        System.out.println("Area in square inches: " + areaInches);
        System.out.println("Area in square cm: " + areaCm);
    }
}



//OUTPUT ->

// Enter base in inches: 6
// Enter height in inches: 10
// Area in square inches: 30.0
// Area in square cm: 193.548
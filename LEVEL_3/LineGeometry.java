import java.util.Scanner;

public class LineGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first point (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Enter second point (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance: %.2f%n", distance);
        
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Line equation: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
    }
    
    // Calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Find line equation (slope and y-intercept)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }
}











//OUTPUT ->
// Enter first point (x1 y1):
// 2 3
// Enter second point (x2 y2):
// 4 5
// Euclidean distance: 2.83
// Line equation: y = 1.00x + 1.00
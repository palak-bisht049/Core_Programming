import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();
        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngest = (youngestAge == amarAge) ? "Amar" : (youngestAge == akbarAge) ? "Akbar" : "Anthony";

        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallest = (tallestHeight == amarHeight) ? "Amar" : (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("Youngest: " + youngest + " " + youngestAge);
        System.out.println("Tallest: " + tallest + " " + tallestHeight);
    }
}

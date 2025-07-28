import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int service = sc.nextInt();
        if(service > 5)
            System.out.println("Bonus: " + (0.05 * salary));
        else
            System.out.println("No Bonus");
    }
}

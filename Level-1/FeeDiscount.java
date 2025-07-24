import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original course fee: ");
        double originalFee = sc.nextDouble();

        double discountPercent = 10;
        double discountAmount = (originalFee * discountPercent) / 100;
        double finalFee = originalFee - discountAmount;

        System.out.println(
            "Original Fee: INR " + originalFee + "\n" +
            "Discount: " + discountPercent + "%\n" +
            "Discount Amount: INR " + discountAmount + "\n" +
            "Discounted Fee: INR " + finalFee
        );
    }
}





//OUTPUT ->

// Enter the original course fee: 125000
// Original Fee: INR 125000.0
// Discount: 10.0%
// Discount Amount: INR 12500.0
// Discounted Fee: INR 112500.0
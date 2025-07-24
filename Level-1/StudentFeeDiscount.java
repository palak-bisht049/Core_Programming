import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}



//OUTPUT->

// Enter the Student Fee (INR): 2343578
// Enter the University Discount Percentage: 20
// The discount amount is INR 468715.6 and final discounted fee is INR 1874862.4
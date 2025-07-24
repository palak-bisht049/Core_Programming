import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice;
        int quantity;
        
        System.out.print("Enter unit price in INR: ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        
        double totalPrice = unitPrice * quantity;
        System.out.println("Total Price: INR " + totalPrice);
    }
}




//OUTPUT ->

// Enter unit price in INR: 56
// Enter quantity: 2
// Total Price: INR 112.0
import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}


//OUTPUT ->

// Enter unit price (INR): 345547
// Enter quantity: 23
// The total purchase price is INR 7947581.0 if the quantity 23 and unit price is INR 345547.0

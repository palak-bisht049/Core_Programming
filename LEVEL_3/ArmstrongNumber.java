import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        
        int originalNumber = number;
        
        System.out.println("\nChecking if " + number + " is an Armstrong number...");
        System.out.println("Armstrong Number: Sum of cubes of each digit equals the original number");
        System.out.println("Example: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153\n");

    }
    
    
}    
        


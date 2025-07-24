import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your height in cm: ");
        double cm = input.nextDouble();

  
        double totalInches = cm / 2.54;

       
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + cm+" while in feet is " + feet +" and inches is " + String.format("%.2f", inches));
    }
}



//OUTPUT ->

// Enter your height in cm: 162
// Your Height in cm is 162.0 while in feet is 5 and inches is 3.78


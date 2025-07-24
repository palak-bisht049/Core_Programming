import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1, number2;
        
        System.out.print("Enter first number: ");
        number1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        number2 = sc.nextFloat();
        
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}




//OUTPUT ->

// Enter first number: 5
// Enter second number: 10
// Addition: 15.0
// Subtraction: -5.0
// Multiplication: 50.0
// Division: 0.5

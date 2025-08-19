

import java.util.Scanner;

public class SimpleInterest {

    public static double SimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time in years: ");
        double time = sc.nextDouble();

        double interest = SimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest +" for Principal " + principal +", Rate of Interest " + rate +" and Time " + time);

    }
}






//OUTPUT ->
// Enter Principal amount: 230
// Enter Rate of Interest: 10
// Enter Time in years: 20
// The Simple Interest is 460.0 for Principal 230.0, Rate of Interest 10.0 and Time 20.0
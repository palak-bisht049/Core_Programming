import java.util.Scanner;

public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Harry's age in " + currentYear + " is: " + age);
    }
}




//OUTPUT ->

// Enter birth year: 2000
// Harry's age in 2024 is: 24
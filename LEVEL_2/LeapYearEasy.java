import java.util.Scanner;

public class LeapYearEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        } else {
            System.out.println("Year should be >= 1582");
        }

        sc.close();
    }
}







//OUTPUT ->
// Enter a year: 5
// Year should be >= 1582

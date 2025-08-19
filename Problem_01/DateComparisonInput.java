import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonInput {
    public static void compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2))
            System.out.println("First date is before second date.");
        else if (d1.isAfter(d2))
            System.out.println("First date is after second date.");
        else
            System.out.println("Both dates are the same.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.println("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        compareDates(date1, date2);
    }
}

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticInput {
    public static LocalDate manipulateDate(LocalDate date) {
        return date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date (YYYY-MM-DD): ");
        String dateStr = sc.nextLine();
        LocalDate inputDate = LocalDate.parse(dateStr);
        LocalDate result = manipulateDate(inputDate);
        System.out.println("Final Date after operations: " + result);
    }
}

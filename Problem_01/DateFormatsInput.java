import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatsInput {
    public static void displayFormattedDates(LocalDate date) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + date.format(f1));
        System.out.println("Format 2: " + date.format(f2));
        System.out.println("Format 3: " + date.format(f3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        displayFormattedDates(date);
    }
}

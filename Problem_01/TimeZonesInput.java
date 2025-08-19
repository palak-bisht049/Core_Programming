import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZonesInput {
    public static void displayTimes(String zone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Time in " + zone + ": " + time.format(formatter));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time zone (e.g., GMT, Asia/Kolkata, America/Los_Angeles): ");
        String inputZone = sc.nextLine();
        displayTimes(inputZone);
    }
}

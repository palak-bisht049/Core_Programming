import java.util.Scanner;

public class CalendarGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        displayCalendar(month, year);
    }
    
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }
    
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 
            31, 31, 30, 31, 30, 31
        };
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
    
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        
        return d0;
    }
}







//OUTPUT ->
// Enter month (1-12): 4
// Enter year: 2000

// April 2000
// Sun Mon Tue Wed Thu Fri Sat
//                           1
//   2   3   4   5   6   7   8
//   9  10  11  12  13  14  15
//  16  17  18  19  20  21  22
//  23  24  25  26  27  28  29 
//  30

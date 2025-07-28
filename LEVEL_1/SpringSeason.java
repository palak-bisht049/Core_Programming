public class SpringSeason {
    public static void main(String[] args) {
        // Add this check at the start of your program
        if (args.length < 2) {
            System.out.println("Error: Please provide month and day as arguments");
            System.out.println("Example: java SpringSeason 4 15");
            return; 
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        if ((month == 3 && day >= 20) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: high / low / correct): ");
            feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it right.");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please enter only 'high', 'low', or 'correct'.");
            }
        }
    }

    static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }
}

import java.util.Arrays;
import java.util.Random;

public class FootballHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        
        // Generate random heights (150-250cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        
        System.out.println("Heights: " + Arrays.toString(heights));
        
        int shortH = Arrays.stream(heights).min().getAsInt();
        int tallH = Arrays.stream(heights).max().getAsInt();
        double avgH = Arrays.stream(heights).average().getAsDouble();
        
        System.out.println("Shortest: " + shortH + "cm");
        System.out.println("Tallest: " + tallH + "cm");
        System.out.printf("Average: %.1fcm", avgH);
    }
}







//OUTPUT ->

// Heights: [238, 232, 185, 216, 173, 210, 216, 210, 185, 248, 223]
// Shortest: 173cm
// Tallest: 248cm
// Average: 212.4cm
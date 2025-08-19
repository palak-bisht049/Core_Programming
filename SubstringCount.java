import java.util.*;
public class SubstringCount {
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        for (int i = 0; i <= main.length() - sub.length(); i++) {
            if (main.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "banana";
        String word = "an";
        System.out.println("Occurrences: " + countOccurrences(text, word));
    }
}

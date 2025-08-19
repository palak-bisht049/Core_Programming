import java.util.*;
public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        String input = "Java is a powerful programming language";
        System.out.println("Longest Word: " + findLongestWord(input));
    }
}

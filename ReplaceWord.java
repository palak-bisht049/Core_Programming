import java.util.*;
public class ReplaceWord {
    public static String replace(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String input = "I love Java";
        System.out.println("Modified: " + replace(input, "Java", "Python"));
    }
}

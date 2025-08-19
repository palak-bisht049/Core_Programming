import java.util.*;
public class CountVowelsConsonants {
    public static int[] countVowelsConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0] + ", Consonants: " + result[1]);
    }
}

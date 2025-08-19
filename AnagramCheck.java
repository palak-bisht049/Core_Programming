import java.util.*;
import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase().replaceAll("\\s", "");
        b = b.toLowerCase().replaceAll("\\s", "");
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println("Anagram? " + isAnagram("listen", "silent"));
    }
}

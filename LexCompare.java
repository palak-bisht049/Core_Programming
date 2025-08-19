import java.util.*;
public class LexCompare {
    public static String compareStrings(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        for (int i = 0; i < minLen; i++) {
            if (a.charAt(i) != b.charAt(i))
                return a.charAt(i) < b.charAt(i) ? a + " comes before " + b : b + " comes before " + a;
        }
        if (a.length() == b.length())
            return "Both strings are equal";
        return a.length() < b.length() ? a + " comes before " + b : b + " comes before " + a;
    }

    public static void main(String[] args) {
        System.out.println(compareStrings("apple", "banana"));
    }
}

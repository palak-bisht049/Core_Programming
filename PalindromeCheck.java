import java.util.*;
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Palindrome? " + isPalindrome(input));
    }
}

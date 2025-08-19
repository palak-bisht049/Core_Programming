import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = inputString();
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }
}

import java.util.*;
public class RemoveCharacter {
    public static String removeChar(String str, char ch) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != ch)
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Modified: " + removeChar(input, 'l'));
    }
}

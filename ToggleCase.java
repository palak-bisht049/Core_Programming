import java.util.*;
public class ToggleCase {
    public static String toggleCase(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "Java123";
        System.out.println("Toggled Case: " + toggleCase(input));
    }
}

import java.util.*;
public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1)
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("After Removing Duplicates: " + removeDuplicates(input));
    }
}



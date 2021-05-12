package String;

import java.util.Locale;

public class StringMethodsPartII {
    public static void main(String[] args) {
        String text = "Never Stop Learning";
        System.out.println(text.toLowerCase(Locale.ROOT));
        System.out.println(text.toUpperCase(Locale.ROOT));
        //***//
        String text1 = "Java programming           ";
        String text2 = "for beginner level";
        System.out.println(text1 + text2);
        System.out.println(text1.trim() + text2);
    }
}

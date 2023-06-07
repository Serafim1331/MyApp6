package Palindrome;

public class IsPalindrome {
    public static boolean isPalindrome(String str2) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            char s = str2.charAt(i);
            if (!Character.isWhitespace(s)) {
                reversed.append(s);
            }

        }
        return reversed.toString().equalsIgnoreCase(str2);
    }

}

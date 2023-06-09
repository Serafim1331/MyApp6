package Palindrome;

public class IsPalindrome {
    public static boolean isPalindrome(String str2) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            char s = str2.charAt(i);
            if (Character.isLetterOrDigit(s)) {
                reversed.append(Character.toLowerCase(s));
            }

        }
        String reversedStr = reversed.toString();
        return reversedStr.equals(reversed.reverse().toString());
    }

}

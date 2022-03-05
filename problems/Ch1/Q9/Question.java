package Q9;

public class Question {
    // Assume you have a method `isSubstring` which checks if one word is a substring of another.
    // Given two string, write code to check if s2 is a rotation of s1 using only one call to `isSubstring`.
    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != 0 && s1.length() == s2.length()) {
            return isSubstring(s1 + s1, s2);
        }
        return false;
    }
}

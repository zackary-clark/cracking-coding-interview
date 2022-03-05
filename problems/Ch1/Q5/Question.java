package Q5;

public class Question {
    // There are three types of edits that can be performed on strings:
    // insert a character, remove a character, or replace a character.
    // Given two string, write a function to check if they are one edit (or zero) away.
    public static boolean oneAway(String a, String b) {
        int lengthDiff = a.length() - b.length();
        if (lengthDiff < -1 || lengthDiff > 1) return false;

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        if (lengthDiff > 0) {
            int j = 0;
            for (int i = 0; i < bChars.length; i++) {
                if (bChars[i] != aChars[j]) {
                    if (bChars[i] != aChars[++j]) {
                        return false;
                    }
                }
                j++;
            }
            return true;
        } else if (lengthDiff < 0) {
            int j = 0;
            for (int i = 0; i < aChars.length; i++) {
                if (aChars[i] != bChars[j]) {
                    if (aChars[i] != bChars[++j]) {
                        return false;
                    }
                }
                j++;
            }
            return true;
        } else {
            boolean edited = false;
            for (int i = 0; i < aChars.length; i++) {
                if (aChars[i] != bChars[i]) {
                    if (edited) {
                        return false;
                    } else {
                        edited = true;
                    }
                }
            }
            return true;
        }
    }
}

package Q2;

import java.util.Hashtable;
import java.util.Map;

public class Question {
    // Given two strings, check if one is a permutation of the other
    public static boolean checkPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        Map<Character, Integer> characterSet = new Hashtable<>();
        for (int i = 0; i < a.length(); i++) {
            characterSet.merge(a.charAt(i), 1, Integer::sum);
        }
        for (int j = 0; j < b.length(); j++) {
            if (characterSet.merge(b.charAt(j), -1, Integer::sum) == -1) return false;
        }
        return true;
    }
}

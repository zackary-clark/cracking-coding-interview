package Q1;

import java.util.Set;
import java.util.TreeSet;

public class QuestionA {
    // Implement an algorithm to determine if a string has all unique characters.
    public static boolean isUnique(String input) {
        Set<Character> occurences = new TreeSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (occurences.contains(c)) return false;
            occurences.add(c);
        }
        return true;
    }
    // This works, but knowing the size of the alphabet would allow the use of an array of booleans of size <alphabetsize> instead of the set.
}

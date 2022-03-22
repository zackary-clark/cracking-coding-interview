package Q9;

import java.util.HashSet;
import java.util.Set;

public class Parens {
    // Implement an algorithm to print all valid (e.g. proper opened and closed) combinations of n pairs of parentheses

    // input 2
    // output ()(), (())

    // input 3
    // output ((())), (()()), (())(), ()(()), ()()()

    public static void main(String[] args) {
        System.out.println("Input 2");
        for (String s : findParenCombos(2)) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Input 3");
        for (String s : findParenCombos(3)) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Input 4");
        for (String s : findParenCombos(4)) {
            System.out.println(s);
        }
    }

    private static Set<String> findParenCombos(int n) {
        Set<String> combos = new HashSet<>();
        if (n < 1) return combos;
        combos.add("()");
        for (int i = 2; i <= n; i++) {
            combos = findParenCombosHelper(i, combos);
        }
        return combos;
    }

    private static Set<String> findParenCombosHelper(int n, Set<String> combos) {
        Set<String> newCombos = new HashSet<>();
        for (String s : combos) {
            for (int i = 0; i < 2 * (n - 1); i++) {
                StringBuilder builder = new StringBuilder(2*n);
                builder.insert(0, s);
                builder.insert(i, "()");
                newCombos.add(builder.toString());
            }
        }
        return newCombos;
    }
}

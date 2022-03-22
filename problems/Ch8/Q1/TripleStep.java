package Q1;

public class TripleStep {
    public static long tripleStepNaiveRecursive(int n) {
        if (n < 1) return 0;
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                return tripleStepNaiveRecursive(n-1) + tripleStepNaiveRecursive(n-2) + tripleStepNaiveRecursive(n-3);
        }
    }

    public static long tripleStepMemoized(int n) {
        long a = 1;
        long b = 2;
        long c = 4;
        if (n < 1) return 0;
        switch (n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            default:
                for (int i = 4; i <= n; i++) {
                    long d = a + b + c;
                    if (i == n) return d;
                    a = b;
                    b = c;
                    c = d;
                }
        }
        return 0;
    }
}

package Q1;

public class SortedMerge {
    // You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
    // Write a method to merge B into A in sorted order.
    public static void mergeSorted(int[] a, int[] b) {
        int aRight = a.length - b.length - 1;
        int bRight = b.length - 1;
        int insertIndex = a.length - 1;

        while (bRight >= 0) {
            if (aRight >= 0 && a[aRight] >= b[bRight]) {
                a[insertIndex--] = a[aRight--];
            } else {
                a[insertIndex--] = b[bRight--];
            }
        }
    }
}

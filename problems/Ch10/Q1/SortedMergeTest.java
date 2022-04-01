package Q1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static Q1.SortedMerge.mergeSorted;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortedMergeTest {
    @Test
    public void mergeSortedTest() {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        int[] b = {2,4};
        mergeSorted(a, b);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, a);

        int[] c = new int[12];
        c[0] = 2;
        c[1] = 3;
        c[2] = 6;
        c[3] = 7;
        c[4] = 10;
        int[] d = {1,3,4,5,7,8,9};
        mergeSorted(c, d);
        System.out.println(Arrays.toString(c));
        assertArrayEquals(new int[]{1,2,3,3,4,5,6,7,7,8,9,10}, c);
    }
}
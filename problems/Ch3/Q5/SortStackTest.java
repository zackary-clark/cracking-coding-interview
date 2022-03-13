package Q5;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortStackTest {
    @Test
    public void sort_shouldSort() {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(3);
        Integer[] expected = {4,3,2,1};
        SortStack.sort(stack);
        assertArrayEquals(expected, stack.toArray());
    }
}

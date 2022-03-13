package Q5;

import java.util.Stack;

public class SortStack {
    // Write a program to sort a stack, such that the smallest items are on top.
    // You can use an additional temporary stack, but you may not copy the elements into any other data structure.
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tempVal = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > tempVal) {
                stack.push(tempStack.pop());
            }
            tempStack.push(tempVal);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

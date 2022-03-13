package Q4;

import java.util.Stack;

public class MyQueue {
    // Implement a queue using two stacks.
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public MyQueue() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public int size() {
        return enqueueStack.size() + dequeueStack.size();
    }

    public void enqueue(int val) {
        rotateIfNecessary(dequeueStack, enqueueStack);
        enqueueStack.push(val);
    }

    public int dequeue() {
        rotateIfNecessary(enqueueStack, dequeueStack);
        return dequeueStack.pop();
    }

    public int peek() {
        rotateIfNecessary(enqueueStack, dequeueStack);
        return dequeueStack.peek();
    }

    private void rotateIfNecessary(Stack<Integer> from, Stack<Integer> to) {
        if (to.isEmpty()) {
            while (!from.isEmpty()) {
                to.push(from.pop());
            }
        }
    }
}

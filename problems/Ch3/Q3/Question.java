package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question {
    // Imagine a literal stack of plates. If the stack gets too high, it might topple.
    // Therefore, we would likely start a new stack when the previous stack exceeds some threshold.
    // Implement a data structure `SetOfStacks` that mimics this.
    // push() and pop() APIs should be identical to single stacks.
    private int sizeThreshold;
    private List<Stack<Integer>> stacks;

    public Question(int threshold) {
        this.sizeThreshold = threshold; // check for threshold < 1, and throw
        Stack<Integer> firstStack = new Stack<>();
        this.stacks = new ArrayList<>();
        this.stacks.add(firstStack);
    }

    public void push(int data) {
        Stack<Integer> lastStack = this.stacks.get(this.stacks.size() - 1);
        if (lastStack.size() < this.sizeThreshold) {
            lastStack.push(data);
        } else {
            Stack<Integer> newStack = new Stack<>();
            newStack.push(data);
            this.stacks.add(newStack);
        }
    }

    public int pop() {
        int listSize = this.stacks.size();
        // if only one stack, and empty, throw
        Stack<Integer> lastStack = this.stacks.get(listSize - 1);
        int retValue = lastStack.pop();
        if (lastStack.isEmpty() && listSize > 1) {
            this.stacks.remove(listSize - 1);
        }
        return retValue;
    }

    public int popAt(int index) {
        // if index > listSize, throw
        Stack<Integer> givenStack = this.stacks.get(index);
        int retValue = givenStack.pop();
        if (givenStack.isEmpty() && this.stacks.size() > 1) {
            this.stacks.remove(index);
        }
        return retValue;
    }
}

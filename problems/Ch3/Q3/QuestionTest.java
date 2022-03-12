package Q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {
    @Test
    public void pop_shouldReturnCorrectly_whenAtBoundaries() {
        Question setOfStacks = new Question(2);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        assertEquals(3, setOfStacks.pop());
        assertEquals(2, setOfStacks.pop());
    }

    @Test
    public void popAt_shouldReturnCorrectly_withoutBreakingPop() {
        Question setOfStacks = new Question(2);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        assertEquals(2, setOfStacks.popAt(0));
        assertEquals(3, setOfStacks.pop());
    }
}

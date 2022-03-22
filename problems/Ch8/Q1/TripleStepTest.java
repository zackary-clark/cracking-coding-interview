package Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TripleStepTest {
    @Test
    public void tripleStepNaiveRecursive_shouldReturnCorrectNumberOfPossibleWays() {
        assertEquals(7, TripleStep.tripleStepNaiveRecursive(4));
        assertEquals(13, TripleStep.tripleStepNaiveRecursive(5));
        assertEquals(24, TripleStep.tripleStepNaiveRecursive(6));
        assertEquals(44, TripleStep.tripleStepNaiveRecursive(7));
        assertEquals(23837527729L, TripleStep.tripleStepNaiveRecursive(40));
    }

    @Test
    public void tripleStepMemoized_shouldReturnCorrectNumberOfPossibleWays() {
        assertEquals(7, TripleStep.tripleStepMemoized(4));
        assertEquals(13, TripleStep.tripleStepMemoized(5));
        assertEquals(24, TripleStep.tripleStepMemoized(6));
        assertEquals(44, TripleStep.tripleStepMemoized(7));
        assertEquals(23837527729L, TripleStep.tripleStepMemoized(40));
    }
}

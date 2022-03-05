package Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q2Test {
    @Test
    public void checkPermutation_shouldReturnFalse_whenNotPermutation() {
        assertFalse(Question.checkPermutation("a", "not a"));
        assertFalse(Question.checkPermutation("a", "b"));
    }

    @Test
    public void checkPermutation_shouldReturnTrue_whenPermutation() {
        assertTrue(Question.checkPermutation("ba", "ab"));
    }
}

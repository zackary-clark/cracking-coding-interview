package Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionTest {
    @Test
    public void palindromePermutation_shouldReturnFalse_whenNot() {
        assertFalse(Question.palindromePermutation("Not One"));
    }

    @Test
    public void palindromePermutation_shouldReturnTrue_whenIs() {
        assertTrue(Question.palindromePermutation("Tact Coa"));
        assertTrue(Question.palindromePermutation("noon"));
        assertTrue(Question.palindromePermutation("no x in nixon"));
        assertTrue(Question.palindromePermutation("don't nod"));
    }
}

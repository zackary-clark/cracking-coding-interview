package Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q1Test {
    @Test
    public void isUnique_shouldReturnFalse_whenStringHasRepeatCharacters() {
        assertFalse(QuestionA.isUnique("repeats"));
    }

    @Test
    public void isUnique_shouldReturnTrue_whenStringIsUnique() {
        assertTrue(QuestionA.isUnique("help"));
    }
}

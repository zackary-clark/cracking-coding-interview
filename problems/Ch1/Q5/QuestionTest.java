package Q5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionTest {
    @Test
    public void oneAway_shouldReturnTrue_whenTrue() {
        assertTrue(Question.oneAway("a", "a"));
        assertTrue(Question.oneAway("a", "ab"));
        assertTrue(Question.oneAway("a", ""));
        assertTrue(Question.oneAway("a", "u"));
        assertTrue(Question.oneAway("test", "tst"));
    }

    @Test
    public void oneAway_shouldReturnFalse_whenFalse() {
        assertFalse(Question.oneAway("a", "asdf"));
        assertFalse(Question.oneAway("test", "teeest"));
        assertFalse(Question.oneAway("test", "tase"));
    }
}

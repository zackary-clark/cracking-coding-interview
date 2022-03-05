package Q9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuestionTest {
    @Test
    public void isRotation_shouldReturnFalse_whenNotRotation() {
        assertFalse(Question.isRotation("string", "ring"));
        assertFalse(Question.isRotation("not", "thesame"));
    }

    @Test
    public void isRotation_shouldReturnTrue_whenRotation() {
        assertTrue(Question.isRotation("waterbottle", "erbottlewat"));
    }
}

package Q14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanEvaluationTest {
    @Test
    public void countEval_shouldReturnCorrectResult() {
        assertEquals(2, BooleanEvaluation.countEval("1^0|0|1", false));
        assertEquals(10, BooleanEvaluation.countEval("0&0&0&1^1|0", true));
    }
}

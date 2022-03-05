package Q6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {
    @Test
    public void compress_shouldReturnOriginalString_whenCompressionIsIneffective() {
        assertEquals("test", Question.compress("test"));
        assertEquals("abcde", Question.compress("abcde"));
    }

    @Test
    public void compress_shouldReturnCompressedString_whenCompressionIsEffective() {
        assertEquals("a2b1c5a3", Question.compress("aabcccccaaa"));
        assertEquals("d3e1b1y1z8Z1z1", Question.compress("dddebyzzzzzzzzZz"));
    }
}
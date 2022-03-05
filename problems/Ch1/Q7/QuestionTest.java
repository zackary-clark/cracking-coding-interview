package Q7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuestionTest {
    @Test
    public void rotateMatrix_shouldReturnRotatedImage() {
        int[][] original = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        int[][] actual = Question.rotateMatrix(original);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void rotateInPlace_shouldReturnRotatedImage() {
        int[][] original = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        int[][] actual = Question.rotateInPlace(original);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void rotateInPlace_shouldReturnRotatedImage_forLargerAndEvenByEvenMatrix() {
        int[][] original = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
        int[][] expected = {{31,25,19,13,7,1},{32,26,20,14,8,2},{33,27,21,15,9,3},{34,28,22,16,10,4},{35,29,23,17,11,5},{36,30,24,18,12,6}};
        int[][] actual = Question.rotateInPlace(original);
        assertArrayEquals(expected, actual);
    }
}

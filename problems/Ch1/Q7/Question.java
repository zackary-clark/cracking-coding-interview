package Q7;

public class Question {
    // Given an image represented by an N x N matrix, where each pixel is represented by an int,
    // write a method to rotate the image by 90 degrees.
    public static int[][] rotateMatrix(int[][] image) {
        int n = image.length;
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                ret[j][n - i - 1] = image[i][j];
            }
        }
        return ret;
    }
    // Can you do it in place?
    public static int[][] rotateInPlace(int[][] image) {
        int n = image.length;
        int a, b, c, d;
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1-i; j++) {
                a = image[i][j];
                b = image[j][n - i - 1];
                c = image[n - i - 1][n - j - 1];
                d = image[n - j - 1][i];
                image[i][j] = d;
                image[j][n - i - 1] = a;
                image[n - i - 1][n - j - 1] = b;
                image[n - j - 1][i] = c;
            }
        }
        return image;
    }
}

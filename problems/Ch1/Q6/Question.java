package Q6;

public class Question {
    // Implement a method to perform basic string compression using the counts of repeated characters.
    // If the compressed string would not become smaller than the original string, return the original string.
    // You can assume only uppercase and lowercase characters.
    public static String compress(String input) {
        char[] inputChars = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        int currCharCount = 1;
        char currChar = inputChars[0];
        for (int i = 1; i < inputChars.length; i++) {
            if (inputChars[i] == currChar) {
                currCharCount++;
            } else {
                builder.append(currChar);
                builder.append(currCharCount);
                currChar = inputChars[i];
                currCharCount = 1;
            }
        }
        builder.append(currChar);
        builder.append(currCharCount);
        return input.length() < builder.length() ? input : builder.toString();
    }
}

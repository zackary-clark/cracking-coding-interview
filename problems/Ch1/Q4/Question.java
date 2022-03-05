package Q4;

public class Question {
    // Given a string, write a function to check if it is a permutation of a palindrome
    public static boolean palindromePermutation(String input) {
        int[] occurences = new int[26];
        char[] characters = input.toCharArray();
        for (char character : characters) {
            int numericValue = Character.getNumericValue(character);
            if (numericValue > 9 && numericValue <= 35) {
                occurences[numericValue - 9]++;
            }
        }
        boolean singleOdd = false;
        int totalletters = 0;
        for (int occurence : occurences) {
            totalletters += occurence;
            if (occurence % 2 == 1) {
                if (!singleOdd) {
                    singleOdd = true;
                } else {
                    return false;
                }
            }
        }
        return (totalletters % 2 == 1) == singleOdd;
    }
}

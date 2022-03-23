package Q14;

import java.util.Stack;

public class BooleanEvaluation {
    // Given a boolean expression consisting of the symbols 0, 1, &, |, ^, and a desired result bool,
    // implement a function to count the number of ways of parenthesizing the expression such that it evaluates to result.
    // countEval("1^0|0|1", false) -> 2

    public static int countEval(String expression, boolean desiredResult) {
        Stack<Boolean> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        operands.push(parseBoolFrom0or1String(expression.substring(0, 1)));

        return countEvalHelper(expression, desiredResult, 1, operands, operators);
    }

    private static int countEvalHelper(String expression, boolean desiredResult, int startIndex, Stack<Boolean> operands, Stack<String> operators) {
        int firstChoiceResult = 0;
        int secondChoiceResult = 0;

        if (startIndex + 2 <= expression.length()) {
            String operator = expression.substring(startIndex, startIndex + 1);
            Boolean operand = parseBoolFrom0or1String(expression.substring(startIndex + 1, startIndex + 2));
            Stack<Boolean> firstChoiceOperands = (Stack<Boolean>) operands.clone();
            Stack<String> firstChoiceOperators = (Stack<String>) operators.clone();
            firstChoiceOperands.push(operand);
            firstChoiceOperators.push(operator);
            firstChoiceResult = countEvalHelper(expression, desiredResult, startIndex + 2, firstChoiceOperands, firstChoiceOperators);
        }

        if (operators.size() > 0) {
            Stack<Boolean> secondChoiceOperands = (Stack<Boolean>) operands.clone();
            Stack<String> secondChoiceOperators = (Stack<String>) operators.clone();
            Boolean prevOperand = secondChoiceOperands.pop();
            Boolean prevPrevOperand = secondChoiceOperands.pop();
            String prevOperator = secondChoiceOperators.pop();

            secondChoiceOperands.push(calcBoolWithStringOperator(prevPrevOperand, prevOperator, prevOperand));
            secondChoiceResult = countEvalHelper(expression, desiredResult, startIndex, secondChoiceOperands, secondChoiceOperators);
        } else if (startIndex + 2 > expression.length()) {
            return operands.peek() == desiredResult ? 1 : 0;
        }

        return firstChoiceResult + secondChoiceResult;
    }

    private static boolean parseBoolFrom0or1String(String s) {
        switch (s) {
            case "0":
                return false;
            case "1":
                return true;
            default:
                throw new RuntimeException("Unacceptable Operand");
        }
    }

    private static boolean calcBoolWithStringOperator(boolean firstOperand, String operator, boolean secondOperand) {
        switch (operator) {
            case "&":
                return firstOperand & secondOperand;
            case "|":
                return firstOperand | secondOperand;
            case "^":
                return firstOperand ^ secondOperand;
            default:
                throw new RuntimeException("Unacceptable Operator");
        }
    }
}

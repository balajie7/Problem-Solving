package Day4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesesHelper(result, "", 0, 0, n);
        return result;
    }

    private static void generateParenthesesHelper(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesesHelper(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            generateParenthesesHelper(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> parenthesesCombinations = generateParentheses(n);
        System.out.println("Combinations of parentheses: " + parenthesesCombinations);
    }
}

package Day4;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> permute(String str) {
        List<String> permutations = new ArrayList<>();
        permuteHelper(str, 0, str.length() - 1, permutations);
        return permutations;
    }

    private static void permuteHelper(String str, int left, int right, List<String> permutations) {
        if (left == right) {
            permutations.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permuteHelper(str, left + 1, right, permutations);
                str = swap(str, left, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = permute(str);
        System.out.println("Permutations of the string: " + permutations);
    }
}

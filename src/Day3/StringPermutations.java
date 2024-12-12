package Day3;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> findPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str, 0, str.length() - 1, permutations);
        return permutations;
    }

    private static void permute(String str, int left, int right, List<String> permutations) {
        if (left == right) {
            permutations.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, permutations);
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
        List<String> permutations = findPermutations(str);
        System.out.println("Permutations: " + permutations);
    }
}

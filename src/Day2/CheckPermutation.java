package Day2;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean arePermutations(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        System.out.println("Are arrays permutations? " + arePermutations(arr1, arr2));
    }
}

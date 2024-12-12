package Day5;

import java.util.Arrays;

public class SortHalfArray {
    public static void sortHalf(int[] arr) {
        int mid = arr.length / 2;
        Arrays.sort(arr, 0, mid);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 7, 1};
        sortHalf(arr);
        System.out.println("Array after sorting the first half: " + Arrays.toString(arr));
    }
}

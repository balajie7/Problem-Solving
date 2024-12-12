package Day5;

import java.util.Arrays;

public class SortStringsByLength {
    public static void sortByLength(String[] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a.length(), b.length()));
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "grape", "pear"};
        sortByLength(arr);
        System.out.println("Strings sorted by length: " + Arrays.toString(arr));
    }
}

package Day2;

import java.util.Arrays;

public class LeftRotateArray {
    public static void leftRotate(int[] arr) {
        if (arr.length <= 1) return;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }
}

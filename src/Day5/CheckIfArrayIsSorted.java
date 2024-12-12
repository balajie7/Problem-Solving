package Day5;

public class CheckIfArrayIsSorted {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        System.out.println("Is the array sorted? " + isSorted(arr));
    }
}

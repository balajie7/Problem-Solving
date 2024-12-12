package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] resArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resArray[k] = result.get(k);
        }

        return resArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4, 5};
        int[] nums2 = {2, 2, 3, 5};
        int[] result = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}

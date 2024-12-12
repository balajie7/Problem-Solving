package Day6;

public class MaximumInCircularSortedArray {
    public static int findMax(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid] > nums[mid + 1]) {
                return nums[mid];
            }
            if (mid > left && nums[mid] < nums[mid - 1]) {
                return nums[mid - 1];
            }

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Maximum element: " + findMax(nums));
    }
}

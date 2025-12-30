package Module_2_BinarySearch;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class Problem4_FindMinimumInRotatedSortedArray {

    public static void main (String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int lb = 0;
        int ub = nums.length - 1;

        while (lb < ub) {
            int mid = (lb + ub) / 2;
            if (nums[lb] < nums[ub]) {
                break;
            } else if (nums[lb] <= nums[mid]) {
                lb = mid + 1;
            } else {
                ub = mid;
            }
        }

        return nums[lb];
    }
}

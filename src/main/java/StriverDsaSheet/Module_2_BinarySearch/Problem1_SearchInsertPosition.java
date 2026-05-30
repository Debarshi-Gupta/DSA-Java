package StriverDsaSheet.Module_2_BinarySearch;

// https://leetcode.com/problems/search-insert-position/description/

public class Problem1_SearchInsertPosition {

    public static void main (String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length-1;

        while (lb<ub) {
            int mid = (lb+ub)/2;
            if (target>nums[mid]) {
                lb = mid+1;
            }
            else {
                ub = mid;
            }
        }

        if (target>nums[lb] && lb==nums.length-1) {
            return lb+1;
        }
        else {
            return lb;
        }
    }
}

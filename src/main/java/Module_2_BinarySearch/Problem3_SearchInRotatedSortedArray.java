package Module_2_BinarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class Problem3_SearchInRotatedSortedArray {

    public static void main (String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length-1;

        while (lb<ub) {
            int mid = (lb+ub)/2;

            if (nums[lb]<=nums[mid]) {
                if (nums[lb]<=target && target<=nums[mid]) {
                    ub = mid;
                }
                else {
                    lb = mid+1;
                }
            }
            else {
                if (nums[mid]<target && target<=nums[ub]) {
                    lb = mid+1;
                }
                else {
                    ub = mid;
                }
            }
        }

        if (nums[lb]==target) {
            return lb;
        }
        else {
            return -1;
        }
    }
}

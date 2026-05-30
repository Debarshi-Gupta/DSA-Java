package StriverDsaSheet.Module_2_BinarySearch;

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class Problem5_FindSingleElementInSortedArrayOfDuplicates {

    public static void main (String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int lb = 0;
        int ub = nums.length-1;

        while (lb<ub) {
            int mid = (lb+ub)/2;
            if (mid%2==0) {
                if (mid!=nums.length-1 && nums[mid+1]==nums[mid]) {
                    lb = mid+1;
                }
                else if (mid!=0 && nums[mid-1]==nums[mid]) {
                    ub = mid;
                }
                else {
                    lb = mid;
                    break;
                }
            }
            else {
                if (mid!=nums.length-1 && nums[mid+1]==nums[mid]) {
                    ub = mid;
                }
                else if (mid!=0 && nums[mid-1]==nums[mid]) {
                    lb = mid+1;
                }
                else {
                    lb = mid;
                    break;
                }
            }
        }

        return nums[lb];
    }
}

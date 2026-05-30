package StriverDsaSheet.Module_2_BinarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class Problem2_FindFirstAndLastOccurrence {

    public static void main (String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length==0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        int lb = 0;
        int ub = nums.length-1;

        while (lb<=ub) {
            int mid = (lb+ub)/2;
            if (nums[mid]==target) {
                result[0] = mid;
                ub = mid-1;
            }
            else if (nums[mid]<target) {
                lb = mid+1;
            }
            else {
                ub = mid-1;
            }
        }

        lb = 0;
        ub = nums.length-1;

        while (lb<=ub) {
            int mid = (lb+ub)/2;
            if (nums[mid]==target) {
                result[1] = mid;
                lb = mid+1;
            }
            else if (nums[mid]<target) {
                lb = mid+1;
            }
            else {
                ub = mid-1;
            }
        }

        result[0] = nums[result[0]]==target?result[0]:-1;
        result[1] = nums[result[1]]==target?result[1]:-1;

        return result;
    }
}

package StriverDsaSheet.Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class Problem2_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i]!=nums[i-1]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index+1;
    }
}

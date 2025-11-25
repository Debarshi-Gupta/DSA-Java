package Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/next-permutation/description/

public class Problem15_NextLexicographicalOrder {

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int pivot = -1;

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]<nums[i+1]) {
                pivot = i;
            }
        }

        if (pivot==-1) {
            reverse(nums, 0, nums.length-1);
            return;
        }

        int nextGreater = Integer.MAX_VALUE;
        int nextGreaterIndex = -1;
        for (int i=pivot+1; i<nums.length; i++){
            if (nums[i]>nums[pivot] && nums[i]<=nextGreater) {
                nextGreaterIndex = i;
                nextGreater = nums[i];
            }
        }

        int tmp = nums[pivot];
        nums[pivot] = nums[nextGreaterIndex];
        nums[nextGreaterIndex] = tmp;
        reverse(nums, pivot+1, nums.length-1);
        return;
    }

    public static void reverse (int[] nums, int start, int end) {
        while (start<end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}

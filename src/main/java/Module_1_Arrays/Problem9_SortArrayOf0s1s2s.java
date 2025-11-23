package Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/

public class Problem9_SortArrayOf0s1s2s {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int left = -1;
        int right = nums.length;

        for (int i=0; i<nums.length; i++) {
            if (i>=right) {
                break;
            }
            if (nums[i]==0) {
                left++;
                int tmp = nums[left];
                nums[left] = nums[i];
                nums[i] = tmp;
            }
            else if (nums[i]==2) {
                right--;
                int tmp = nums[right];
                nums[right] = nums[i];
                nums[i] = tmp;
                i--;
            }
        }
    }
}

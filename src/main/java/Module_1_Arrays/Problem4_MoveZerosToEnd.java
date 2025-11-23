package Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/

public class Problem4_MoveZerosToEnd {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int index = -1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=0) {
                index++;
                int tmp = nums[index];
                nums[index] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}

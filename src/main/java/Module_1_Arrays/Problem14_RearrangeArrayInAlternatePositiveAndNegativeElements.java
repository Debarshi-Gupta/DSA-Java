package Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class Problem14_RearrangeArrayInAlternatePositiveAndNegativeElements {

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];

        int positive = 0;
        int negative = 1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i]>=0) {
                result[positive] = nums[i];
                positive += 2;
            }
            else {
                result[negative] = nums[i];
                negative += 2;
            }
        }

        return result;
    }
}

package Module_1_Arrays;

// https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/

import java.util.Arrays;

public class Problem12_PrintMaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        printMaximumSubarraySum(nums);
    }

    public static void printMaximumSubarraySum(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        int[] index = new int[2];
        int[] maxIndex = new int[2];

        for (int i=1; i<nums.length; i++) {
            int oldSum = sum+nums[i];
            int newSum = nums[i];

            if (oldSum>=newSum) {
                sum = oldSum;
                index[1] = i;
                if (sum>maxSum) {
                    maxSum = sum;
                    maxIndex = Arrays.copyOf(index, index.length);
                }
            }
            else {
                sum = newSum;
                index[0] = i;
                index[1] = i;
                if (sum>maxSum) {
                    maxSum = sum;
                    maxIndex = Arrays.copyOf(index, index.length);
                }
            }
        }

        for (int i=maxIndex[0]; i<=maxIndex[1]; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}

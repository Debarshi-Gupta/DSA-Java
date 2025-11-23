package Module_1_Arrays;

// https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/

public class Problem12_PrintMaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        printMaximumSubarraySum(nums);
    }

    public static void printMaximumSubarraySum(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;

        int maxStart = 0;
        int maxEnd = 0;

        for (int i=0; i<nums.length; i++) {
            if (sum+nums[i]>=nums[i]) {
                end = i;
                sum += nums[i];
                if (sum>maxSum) {
                    maxSum = sum;
                    maxStart = start;
                    maxEnd = end;
                }
            }
            else {
                start = i;
                end = i;
                sum = nums[i];
                if (sum>maxSum) {
                    maxSum = sum;
                    maxStart = start;
                    maxEnd = end;
                }
            }
        }

        for (int i=maxStart; i<=maxEnd; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}

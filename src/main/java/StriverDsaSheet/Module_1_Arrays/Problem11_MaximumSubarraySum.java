package StriverDsaSheet.Module_1_Arrays;

//https://leetcode.com/problems/maximum-subarray/description/

public class Problem11_MaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            sum = Math.max(sum+nums[i], nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}

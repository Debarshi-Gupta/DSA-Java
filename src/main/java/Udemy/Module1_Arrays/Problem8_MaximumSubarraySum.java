package Udemy.Module1_Arrays;

public class Problem8_MaximumSubarraySum {

    public static int maximumSubarraySum (int[] nums) {

        if (nums.length==0) {
            return 0;
        }

        int maxSum = nums[0];
        int sum = nums[0];

        for (int i=1; i<nums.length; i++) {
            sum = Math.max(nums[i], sum+nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main (String[] args) {

        // 13
        System.out.println(
                maximumSubarraySum(new int[]{-1, 2, 3, 4, -2, 6, -8, 3})
        );

        // 23
        System.out.println(
                maximumSubarraySum(new int[]{5, 4, -1, 7, 8})
        );

        // -1
        System.out.println(
                maximumSubarraySum(new int[]{-2, -3, -1, -5})
        );
    }
}

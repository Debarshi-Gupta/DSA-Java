package Module_1_Arrays;

// https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/

public class Problem6_LongestSubarrayWithSumKPositiveElements {

    public static void main(String[] args) {
        int[] nums = {2,3,5,1,9};
        System.out.println(findLongestSubarray(nums, 10));
    }

    public static int findLongestSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int ans = 0;

        for (int right = 0; right<nums.length; right++) {
            sum += nums[right];

            while (left<=right && sum>k) {
                sum -= nums[left];
                left++;
            }

            if (sum==k) {
                ans = Math.max(ans, right-left+1);
            }
        }

        return ans;
    }
}

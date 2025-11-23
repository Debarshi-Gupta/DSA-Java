package Module_1_Arrays;

import java.util.HashMap;
import java.util.Map;

// https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/

public class Problem7_LongestSubarrayWithSumKNegativeElements {

    public static void main(String[] args) {
        int[] nums = {-1, 1, 1};
        System.out.println(findLongestSubarray(nums, 1));
    }

    public static int findLongestSubarray(int[] nums, int k) {

        Map<Integer, Integer> prefixSum = new HashMap<>();

        int sum = 0;
        int ans = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];

            if (sum==k) {
                ans = Math.max(ans, i+1);
            }

            int requiredPrefixSum = sum - k;

            if (prefixSum.containsKey(requiredPrefixSum)) {
                ans = Math.max(ans, i-prefixSum.get(requiredPrefixSum));
            }

            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, i);
            }
        }

        return ans;
    }
}

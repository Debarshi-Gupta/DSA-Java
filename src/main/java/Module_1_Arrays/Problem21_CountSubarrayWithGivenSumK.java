package Module_1_Arrays;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/subarray-sum-equals-k/description/

public class Problem21_CountSubarrayWithGivenSumK {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        int count = 0;
        int sum = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];

            if (sum==k) {
                count++;
            }

            int requiredPrefixSum = sum - k;

            if (prefixSumCount.containsKey(requiredPrefixSum)) {
                count += prefixSumCount.get(requiredPrefixSum);
            }

            if (prefixSumCount.containsKey(sum)) {
                prefixSumCount.put(sum, prefixSumCount.get(sum)+1);
            }
            else {
                prefixSumCount.put(sum, 1);
            }
        }

        return count;
    }
}

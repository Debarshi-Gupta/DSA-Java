package Udemy.Module4_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Problem6_CountSubarraysWithTargetSum {

    public static int countSubarraysWithTargetSum (int[] nums, int target) {

        Map<Integer, Integer> prefixMap = new HashMap<>();

        int currentSum = 0;
        int count = 0;

        for (int i=0; i<nums.length; i++) {

            currentSum += nums[i];

            if (currentSum==target) {
                count++;
            }

            int required = currentSum - target;

            if (prefixMap.containsKey(required)) {
                count += prefixMap.get(required);
            }

            if (prefixMap.containsKey(currentSum)) {
                prefixMap.put(currentSum, prefixMap.get(currentSum)+1);
            }
            else{
                prefixMap.put(currentSum, 1);
            }
        }

        return count;
    }

    public static void main (String[] args) {

        // 3
        System.out.println(countSubarraysWithTargetSum(
                new int[]{10, 2, -2, -20, 10}, -10
        ));

        // 2
        System.out.println(countSubarraysWithTargetSum(
                new int[]{1, 1, 1}, 2
        ));

        // 3
        System.out.println(countSubarraysWithTargetSum(
                new int[]{1, -1, 0}, 0
        ));
    }
}

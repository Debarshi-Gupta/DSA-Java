package Udemy.Module4_SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Problem1_SubarraysWithGivenSum {

    public static List<List<Integer>> subarrayWithGivenSum (int[] nums, int target) {

        int left = 0;

        int currentSum = nums[0];

        List<List<Integer>> result = new ArrayList<>();

        if (currentSum==target) {
            List<Integer> solution = List.of(0, 0);
            result.add(solution);
        }

        for (int i=1; i<nums.length; i++) {
            currentSum += nums[i];

            while (left<=i && currentSum>target) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum==target) {
                List<Integer> solution = List.of(left, i);
                result.add(solution);
            }
        }

        return result;
    }

    public static void main (String[] args) {

        // [[2, 5], [4, 6], [5, 9]]
        System.out.println(subarrayWithGivenSum(
                new int[]{1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2}, 8));

        // [[1, 3], [3, 4]]
        System.out.println(subarrayWithGivenSum(
                new int[]{1, 2, 3, 4, 5}, 9));

        // []
        System.out.println(subarrayWithGivenSum(
                new int[]{1, 2, 3}, 10));
    }
}

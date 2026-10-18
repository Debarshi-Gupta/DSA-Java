package Udemy.Module1_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem1_TwoSum {

    public static int[] twoSum (int[] nums, int target) {

        Set<Integer> visited = new HashSet<>();
        int[] result = new int[2];

        for (int i=0; i<nums.length; i++) {
            int required = target - nums[i];
            if (visited.contains(required)) {
                result[0] = required;
                result[1] = nums[i];
                break;
            }
            else {
                visited.add(nums[i]);
            }
        }

        return result;
    }

    public static void main (String[] args) {

        // [8, -2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 7, 1, 8, 2, -2}, 6)));

        // [2, 7]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

        // [-3, 3]
        System.out.println(Arrays.toString(twoSum(new int[]{-3, 4, 3, 90}, 0)));
    }
}

package StriverDsaSheet.Module_1_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/description/

public class Problem8_2Sum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();
        int[] result = new int[2];

        for (int i=0; i<nums.length; i++) {
            if (visited.containsKey(target-nums[i])) {
                result[0] = visited.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            else {
                visited.put(nums[i], i);
            }
        }

        return result;
    }
}

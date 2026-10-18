package Udemy.Module1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2_ThreeSum {

    public static List<List<Integer>> threeSum (int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (i!=0 && nums[i]==nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while (left<right) {
                if (nums[i] + nums[left] + nums[right] == target) {
                    List<Integer> solution = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(solution);

                    left++;
                    while (left<nums.length && nums[left]==nums[left-1]) {
                        left++;
                    }

                    right--;
                    while (right>=0 && nums[right]==nums[right+1]) {
                        right--;
                    }
                }
                else if (nums[i] + nums[left] + nums[right] < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main (String[] args) {

        // [[-2, 0, 8], [-2, 1, 7], [1, 2, 3]]
        System.out.println(threeSum(new int[]{3, 7, 1, 8, 2, -2, 0}, 6));

        // [[1, 3, 5], [2, 3, 4]]
        System.out.println(threeSum(new int[]{1, 2, 3, 4, 5}, 9));

        // [[1, 1, 2]]
        System.out.println(threeSum(new int[]{1, 1, 1, 2, 2, 3}, 4));
    }
}

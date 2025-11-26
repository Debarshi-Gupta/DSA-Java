package Module_1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/description/

public class Problem23_3Sum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums, 0));
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {
            if (i!=0 && nums[i]==nums[i-1]) {
                continue;
            }
            int start = i+1;
            int end = nums.length-1;

            while (start<end) {
                int sum = nums[i]+nums[start]+nums[end];
                if (sum<target) {
                    start++;
                }
                else if (sum>target) {
                    end--;
                }
                else {
                    List<Integer> solution = List.of(nums[i], nums[start], nums[end]);
                    result.add(solution);

                    start++;
                    while(nums[start]==nums[start-1] && start<end) {
                        start++;
                    }

                    end--;
                    while(nums[end]==nums[end+1] && start<end) {
                        end--;
                    }
                }
            }
        }

        return result;
    }
}

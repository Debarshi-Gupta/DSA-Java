package StriverDsaSheet.Module_1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/4sum/

public class Problem24_4Sum {

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j=i+1; j<nums.length; j++) {
                if (j!=(i+1) && nums[j]==nums[j-1]) {
                    continue;
                }

                int start = j+1;
                int end = nums.length-1;

                while (start<end) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end];
                    if (sum<target) {
                        start++;
                    }
                    else if (sum>target) {
                        end--;
                    }
                    else {
                        List<Integer> answer = List.of(nums[i], nums[j], nums[start], nums[end]);
                        result.add(answer);

                        start++;
                        while(start<nums.length && nums[start]==nums[start-1]){
                            start++;
                        }

                        end--;
                        while(end>j && nums[end]==nums[end+1]) {
                            end--;
                        }
                    }
                }
            }
        }

        return result;
    }
}

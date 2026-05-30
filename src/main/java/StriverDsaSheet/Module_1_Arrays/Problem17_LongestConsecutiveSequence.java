package StriverDsaSheet.Module_1_Arrays;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-consecutive-sequence/description/

public class Problem17_LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> unvisited = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            unvisited.add(nums[i]);
        }

        int ans = 0;
        for (int i=0; i<nums.length; i++) {
            if (!unvisited.contains(nums[i])) {
                continue;
            }

            unvisited.remove(nums[i]);
            int count = 1;

            int prev = nums[i]-1;
            while(unvisited.contains(prev)){
                count++;
                unvisited.remove(prev);
                prev--;
            }

            int next = nums[i]+1;
            while(unvisited.contains(next)){
                count++;
                unvisited.remove(next);
                next++;
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}

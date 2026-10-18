package Udemy.Module1_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Problem4_LongestConsecutiveSequence {

    public static int longestConsecutiveSequence (int[] nums) {

        Set<Integer> numsSet = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            numsSet.add(nums[i]);
        }

        int maxLength = 0;

        for (int i=0; i<numsSet.size(); i++) {
            if (!numsSet.contains(nums[i]-1)) {
                int length=0;
                int value = nums[i];
                while(numsSet.contains(value)) {
                    length++;
                    value++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main (String[] args) {

        // 5
        System.out.println(
                longestConsecutiveSequence(new int[]{5, 2, 122, 1, 4, 14, 3, 9, 10}));

        // 4
        System.out.println(
                longestConsecutiveSequence(new int[]{100, 4, 200, 1, 3, 2}));

        // 1
        System.out.println(
                longestConsecutiveSequence(new int[]{10, 5, 20}));
    }
}

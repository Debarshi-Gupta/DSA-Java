package Udemy.Module1_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem7_MinimumSwapsToSort {

    public static int minimumSwapsToSort (int[] nums) {

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            indexes.put(nums[i], i);
        }

        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int swapCount = 0;
        for (int i=0; i<nums.length; i++) {
           if (nums[i]!=sorted[i]) {
               int index = indexes.get(sorted[i]);
               int tmp = nums[i];
               nums[i] = nums[index];
               nums[index] = tmp;

               indexes.put(nums[i], i);
               indexes.put(nums[index], index);

               swapCount++;
           }
        }

        return swapCount;
    }

    public static void main (String[] args) {

        // 2
       System.out.println(minimumSwapsToSort(new int[]{10, 19, 6, 3, 5}));

       // 4
       System.out.println(minimumSwapsToSort(new int[]{10, 11, 5, 4, 3, 2, 1}));

       // 0
       System.out.println(minimumSwapsToSort(new int[]{1, 2, 3, 4, 5}));
    }
}

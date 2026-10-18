package Udemy.Module1_Arrays;

import java.util.Arrays;

public class Problem6_SubarraySort {

    public static int[] subarraySort (int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {

            if ((i==0 && nums[i]>nums[i+1]) ||
                    (i==nums.length-1 && nums[i]<nums[i-1]) ||
                    (i!=0 && i!=nums.length-1 && (nums[i]<nums[i-1] || nums[i]>nums[i+1]))) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }
        }

        int[] result = new int[2];

        for (int i=0; i<nums.length; i++) {
            if (nums[i]>min) {
                result[0] = i;
                break;
            }
        }

        for (int i=nums.length-1; i>=0; i--) {
            if (nums[i]<max) {
                result[1] = i;
                break;
            }
        }

        if (min==Integer.MAX_VALUE && max==Integer.MIN_VALUE) {
            result[0] = -1;
            result[1] = -1;
        }

        return result;
    }

    public static void main (String[] args) {

        // [7, 11]
        System.out.println(Arrays.toString(
                subarraySort(new int[]{1, 2, 3, 3, 4, 5, 6, 8, 6, 7, 9, 8, 10, 11})
        ));

        // [2, 4]
        System.out.println(Arrays.toString(
                subarraySort(new int[]{1, 2, 6, 4, 5, 7})
        ));

        // [-1, -1]
        System.out.println(Arrays.toString(
                subarraySort(new int[]{1, 2, 3, 4, 5})
        ));
    }
}

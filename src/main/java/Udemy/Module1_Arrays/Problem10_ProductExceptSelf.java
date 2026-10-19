package Udemy.Module1_Arrays;

import java.util.Arrays;

public class Problem10_ProductExceptSelf {

    public static int[] productExceptSelf (int[] nums) {

        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];

        prefixProduct[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            prefixProduct[i] = nums[i] * prefixProduct[i-1];
        }

        suffixProduct[nums.length-1] = nums[nums.length-1];
        for (int i=nums.length-2; i>=0; i--) {
            suffixProduct[i] = nums[i] * suffixProduct[i+1];
        }

        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            if (i==0) {
                result[i] = suffixProduct[i+1];
            }
            else if (i==nums.length-1) {
                result[i] = prefixProduct[i-1];
            }
            else {
                result[i] = prefixProduct[i-1] * suffixProduct[i+1];
            }
        }

        return result;
    }

    public static void main (String[] args) {

        // [120, 60, 40, 30, 24]
        System.out.println(Arrays.toString(
                productExceptSelf(new int[]{1, 2, 3, 4, 5})
        ));

        // [12, 8, 6]
        System.out.println(Arrays.toString(
                productExceptSelf(new int[]{2, 3, 4})
        ));

        // [0, 0, 8, 0]
        System.out.println(Arrays.toString(
                productExceptSelf(new int[]{1, 2, 0, 4})
        ));
    }
}

package Module_1_Arrays;

// https://leetcode.com/problems/maximum-product-subarray/description/

public class Problem29_MaximumProductSubarray {

    public static void main (String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];

        int max = nums[0];

        for (int i=1; i<nums.length; i++) {
            if (nums[i]>=0) {
                maxProduct = Math.max(maxProduct*nums[i], nums[i]);
                minProduct = Math.min(minProduct*nums[i], nums[i]);
            }
            else {
                int maxProduct1 = maxProduct;
                maxProduct = Math.max(minProduct*nums[i], nums[i]);
                minProduct = Math.min(maxProduct1*nums[i], nums[i]);
            }
            max = Math.max(max, maxProduct);
        }

        return max;
    }
}

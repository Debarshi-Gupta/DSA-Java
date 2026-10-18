package Udemy.Module1_Arrays;

public class Problem5_TrappingRainWater {

    public static int trappingRainWater (int[] nums) {

        int leftMax = 0;
        int rightMax = nums.length-1;

        int left = 1;
        int right = nums.length-2;

        int water = 0;

        while (left<=right) {

            if (nums[leftMax]<nums[rightMax]) {
                water += Math.max(0, nums[leftMax]-nums[left]);
                leftMax = nums[leftMax]>=nums[left]?leftMax:left;
                left++;
            }
            else {
                water += Math.max(0, nums[rightMax]-nums[right]);
                rightMax = nums[rightMax]>=nums[right]?rightMax:right;
                right--;
            }
        }

        return water;
    }

    public static void main (String[] args) {

        // 9
        System.out.println(
                trappingRainWater(new int[]{2, 1, 5, 3, 1, 0, 4})
        );

        // 7
        System.out.println(
                trappingRainWater(new int[]{3, 0, 2, 0, 4})
        );

        // 0
        System.out.println(
                trappingRainWater(new int[]{3, 2, 1, 0})
        );
    }
}

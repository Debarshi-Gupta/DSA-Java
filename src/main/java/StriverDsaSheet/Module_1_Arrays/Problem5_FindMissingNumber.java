package StriverDsaSheet.Module_1_Arrays;

// https://leetcode.com/problems/missing-number/

public class Problem5_FindMissingNumber {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int expected = (nums.length*(nums.length+1))/2;

        int actual = 0;
        for (int i=0; i<nums.length; i++) {
            actual += nums[i];
        }

        return expected-actual;
    }
}

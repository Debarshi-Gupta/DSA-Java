package StriverDsaSheet.Module_1_Arrays;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class Problem1_CheckIfArrayIsSortedAndRotated {

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};

        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int pivot = 0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i]<nums[i-1]) {
                pivot = i;
                break;
            }
        }

        if (pivot==0) {
            return true;
        }

        for (int i=pivot+1; i<nums.length; i++) {
            if (nums[i]<nums[i-1]) {
                return false;
            }
        }

        if (nums[nums.length-1]<=nums[0]) {
            return true;
        }
        else {
            return false;
        }
    }
}

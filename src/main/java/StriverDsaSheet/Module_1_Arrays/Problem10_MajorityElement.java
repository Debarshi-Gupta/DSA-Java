package StriverDsaSheet.Module_1_Arrays;

// https://leetcode.com/problems/majority-element/description/

public class Problem10_MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int majorityCount = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i]==majorityElement) {
                majorityCount++;
            }
            else {
                majorityCount--;
                if (majorityCount==0) {
                    majorityElement = nums[i];
                    majorityCount = 1;
                }
            }
        }

        return majorityElement;
    }
}

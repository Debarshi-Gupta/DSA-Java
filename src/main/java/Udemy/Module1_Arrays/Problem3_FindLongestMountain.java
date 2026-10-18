package Udemy.Module1_Arrays;

public class Problem3_FindLongestMountain {

    public static int findLongestMountain (int[] nums) {

        int maxLength = 0;

        for (int i=0; i<nums.length; i++) {

            if ((i==0 && nums[i]>nums[i+1]) ||
                    (i==nums.length-1 && nums[i]>nums[i-1]) ||
                    (i!=0 && i!=nums.length-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1])) {

                int length = 1;

                int left = i-1;
                while (left>=0 && nums[left]<nums[left+1]) {
                    left--;
                    length++;
                }

                int right = i+1;
                while (right<nums.length && nums[right]<nums[right-1]) {
                    right++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);

                i = right;
            }
        }

        return maxLength;
    }

    public static void main (String[] args) {

        // 9
        System.out.println(
                findLongestMountain(new int[]{5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4}));

        // 5
        System.out.println(
                findLongestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));

        // 0
        System.out.println(
                findLongestMountain(new int[]{2, 2, 2}));
    }
}

package GeeksForGeeks.Module4_Arrays;

import java.util.Arrays;

public class Problem5_RemoveDuplicateFromSortedArray {

    public static int removeDuplicateFromSortedArray (int[] nums) {

        int left = -1;

        for (int i=0; i<nums.length; i++) {
            if (i==0 || nums[i]!=nums[i-1]) {
                left++;
                nums[left] = nums[i];
            }
        }

        return left+1;
    }

    public static void main (String[] args) {

        // Expected Output: 10 20 30 40
        int[] nums = new int[]{10, 20, 20, 30, 40, 40, 40};
        int size = removeDuplicateFromSortedArray(nums);
        for (int i=0; i<size; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // Expected Output: 10
        nums = new int[]{10, 10, 10};
        size = removeDuplicateFromSortedArray(nums);
        for (int i=0; i<size; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // Expected Output: 10
        nums = new int[]{10};
        size = removeDuplicateFromSortedArray(nums);
        for (int i=0; i<size; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // Expected Output:
        nums = new int[]{};
        size = removeDuplicateFromSortedArray(nums);
        for (int i=0; i<size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

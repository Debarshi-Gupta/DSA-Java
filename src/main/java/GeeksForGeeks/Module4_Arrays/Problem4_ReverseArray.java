package GeeksForGeeks.Module4_Arrays;

import java.util.Arrays;

public class Problem4_ReverseArray {

    public static int[] reverseArray(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start<end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }

        return nums;
    }

    public static void main (String[] args) {

        // Expected Output: [7, 6, 5, 4]
        System.out.println(Arrays.toString(reverseArray(new int[]{4, 5, 6, 7})));

        // Expected Output: [8, 7, 6, 5, 4]
        System.out.println(Arrays.toString(reverseArray(new int[]{4, 5, 6, 7, 8})));

        // Expected Output: [4]
        System.out.println(Arrays.toString(reverseArray(new int[]{4})));

        // Expected Output: []
        System.out.println(Arrays.toString(reverseArray(new int[]{})));
    }
}

package GeeksForGeeks.Module4_Arrays;

public class Problem1_FindLargestElement {

    public static int findLargestElement (int[] nums) {

        if (nums.length==0) {
            return -1;
        }

        int max = 0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i]>nums[max]) {
                max = i;
            }
        }

        return max;
    }

    public static void main (String[] args) {

        // Expected Output: 2
        System.out.println(findLargestElement(new int[]{10, 12, 20, 15, 11}));

        // Expected Output: 1
        System.out.println(findLargestElement(new int[]{6, 9, 9, 8}));

        // Expected Output: -1
        System.out.println(findLargestElement(new int[]{}));
    }
}

package GeeksForGeeks.Module4_Arrays;

public class Problem3_CheckSortedArray {

    public static boolean checkSortedArray (int[] nums) {

        for (int i=1; i<nums.length; i++) {
            if (nums[i]<nums[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args) {

        // Expected Output: True
        System.out.println(checkSortedArray(new int[]{2, 4, 6, 8, 11}));

        // Expected Output: False
        System.out.println(checkSortedArray(new int[]{2, 4, 6, 5, 11}));

        // Expected Output: True
        System.out.println(checkSortedArray(new int[]{2}));

        // Expected Output: True
        System.out.println(checkSortedArray(new int[]{}));
    }
}

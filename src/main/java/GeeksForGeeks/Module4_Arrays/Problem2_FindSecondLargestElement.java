package GeeksForGeeks.Module4_Arrays;

public class Problem2_FindSecondLargestElement {

    public static int findSecondLargestElement (int[] nums) {

        if (nums.length<=1) {
            return -1;
        }

        int max = 0;
        int secondMax = -1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i]==nums[max]) {
                continue;
            }
            if (secondMax==-1) {
                if (nums[i]>nums[max]) {
                    secondMax = max;
                    max = i;
                }
                else {
                    secondMax = i;
                }
                continue;
            }
            if (nums[i]>nums[max]) {
                secondMax = max;
                max = i;
            }
            else if (nums[i]>nums[secondMax]) {
                secondMax = i;
            }
        }

        return secondMax;
    }

    public static void main (String[] args) {

        // Expected Output: 3
        System.out.println(findSecondLargestElement(new int[]{10, 4, 7, 8, 2}));

        // Expected Output: -1
        System.out.println(findSecondLargestElement(new int[]{10}));

        // Expected Output: -1
        System.out.println(findSecondLargestElement(new int[]{10, 10, 10}));
    }
}

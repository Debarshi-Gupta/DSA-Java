package GeeksForGeeks.Module3_Recursion;

public class Problem8_SubsetSumRecursive {

    public static int subsetSum (int[] nums, int target, int currentIndex, int currentSum) {

        if (currentIndex==nums.length) {
            if (currentSum==target) {
                return 1;
            }
            else {
                return 0;
            }
        }

        return subsetSum(nums, target, currentIndex+1, currentSum) +
        subsetSum(nums, target, currentIndex+1, currentSum+nums[currentIndex]);
    }

    public static void main (String[] args) {

        // Expected Output: 2
        System.out.println(subsetSum(new int[]{10, 5, 2, 3, 6}, 8, 0, 0));

        // Expected Output: 3
        System.out.println(subsetSum(new int[]{5, 5, 5}, 10, 0, 0));

        // Expected Output: 1
        System.out.println(subsetSum(new int[]{10, 20, 15}, 0, 0, 0));
    }
}

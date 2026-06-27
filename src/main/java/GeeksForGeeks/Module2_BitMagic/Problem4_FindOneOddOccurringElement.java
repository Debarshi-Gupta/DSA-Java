package GeeksForGeeks.Module2_BitMagic;

public class Problem4_FindOneOddOccurringElement {

    public static int findOneOddOccurringElement (int[] nums) {

        int result = nums[0];

        for (int i=1; i<nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }

    public static void main (String[] args) {

        // Expected Output: 4
        System.out.println(findOneOddOccurringElement(new int[]{7, 4, 7, 4, 8, 4, 8}));

        // Expected Output: 5
        System.out.println(findOneOddOccurringElement(new int[]{5}));

        // Expected Output: 10
        System.out.println(findOneOddOccurringElement(new int[]{10, 20, 10, 20, 10}));
    }
}

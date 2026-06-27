package GeeksForGeeks.Module2_BitMagic;

import java.util.Arrays;

public class Problem5_FindTwoOddOccurringElement {

    public static int[] findTwoOddOccurringElement (int[] nums) {

        int xor = 0;

        for (int i=0; i<nums.length; i++) {
            xor = xor ^ nums[i];
        }

        xor = xor & (~(xor-1));

        int firstNumber = 0;
        int secondNumber = 0;

        for (int i=0; i<nums.length; i++) {
            if ((nums[i]&xor)==0) {
                firstNumber = firstNumber ^ nums[i];
            }
            else {
                secondNumber = secondNumber ^ nums[i];
            }
        }

        return new int[]{firstNumber, secondNumber};
    }

    public static void main (String[] args) {

        // Expected Output: 6 5
        System.out.println(Arrays.toString(
                findTwoOddOccurringElement(new int[]{3, 4, 3, 4, 5, 4, 4, 6, 7, 7})));

        // Expected Output: 8 11
        System.out.println(Arrays.toString(
                findTwoOddOccurringElement(new int[]{5, 5, 8, 9, 9, 11})));

        // Expected Output: 30 40
        System.out.println(Arrays.toString(
                findTwoOddOccurringElement(new int[]{30, 40})));
    }
}

package Udemy.Module2_String;

import java.util.Arrays;

public class Problem6_BiggestNumber {

    public static String biggestNumber (int[] nums) {

        String[] numsString = new String[nums.length];

        for (int i=0; i<nums.length; i++) {
            numsString[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(numsString, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });

        String result = "";
        for (int i=0; i<numsString.length; i++) {
            result = result.concat(numsString[i]);
        }

        return result;
    }

    public static void main (String[] args) {

        // 330201110
        System.out.println(biggestNumber(new int[]{10, 11, 20, 30, 3}));

        // 9534330
        System.out.println(biggestNumber(new int[]{3, 30, 34, 5, 9}));

        // 210
        System.out.println(biggestNumber(new int[]{10, 2}));
    }
}

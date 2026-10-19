package Udemy.Module1_Arrays;

import java.util.Arrays;

public class Problem9_MinimumDifference {

    public static int[] minimumDifference (int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int left = 0, right = 0;

        int minimumDifference = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left<nums1.length && right<nums2.length) {
            if (nums1[left]<nums2[right]) {
                int difference = nums2[right] - nums1[left];
                if (minimumDifference>difference) {
                    minimumDifference = difference;
                    result[0] = nums1[left];
                    result[1] = nums2[right];
                }
                left++;
            }
            else if (nums1[left]>nums2[right]) {
                int difference = nums1[left] - nums2[right];
                if (minimumDifference>difference) {
                    minimumDifference = difference;
                    result[0] = nums1[left];
                    result[1] = nums2[right];
                }
                right++;
            }
            else {
                result[0] = nums1[left];
                result[1] = nums2[right];
                break;
            }
        }

        return result;
    }

    public static void main (String[] args) {

        // [17, 19]
        System.out.println(
                Arrays.toString(minimumDifference(
                        new int[]{23, 5, 10, 17, 30},
                        new int[]{26, 134, 135, 14, 19}
                ))
        );

        // [1, 2]
        System.out.println(
                Arrays.toString(minimumDifference(
                        new int[]{1, 5, 9},
                        new int[]{2, 6, 10}
                ))
        );

        // [11, 8]
        System.out.println(
                Arrays.toString(minimumDifference(
                        new int[]{1, 3, 15, 11, 2},
                        new int[]{23, 127, 235, 19, 8}
                ))
        );
    }
}

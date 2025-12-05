package Module_1_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/description/

public class Problem26_MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int ptr3 = nums1.length-1;

        while(ptr1>=0 && ptr2>=0) {
            if (nums1[ptr1]>=nums2[ptr2]) {
                nums1[ptr3] = nums1[ptr1];
                ptr3--;
                ptr1--;
            }
            else {
                nums1[ptr3] = nums2[ptr2];
                ptr3--;
                ptr2--;
            }
        }

        while (ptr1>=0) {
            nums1[ptr3] = nums1[ptr1];
            ptr3--;
            ptr1--;
        }

        while (ptr2>=0) {
            nums1[ptr3] = nums2[ptr2];
            ptr3--;
            ptr2--;
        }
    }
}

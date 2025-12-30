package Module_1_Arrays;

// https://leetcode.com/problems/reverse-pairs/description/

public class Problem28_CountReversePairs {

    public static void main (String[] args) {
        int[] nums = {2,4,3,5,1};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int[] nums, int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            count += mergeSort(nums, start, mid);
            count += mergeSort(nums, mid + 1, end);
            count += countReversePairs(nums, start, mid, end);
            merge(nums, start, mid, end);
        }
        return count;
    }

    public static int countReversePairs (int[] nums, int start, int mid, int end) {
        int count = 0;
        int index = mid+1;

        while (start<=mid) {
            if (index<=end && (long)nums[start]>(long)(2*(long)nums[index])) {
                index++;
            }
            else {
                count += index-mid-1;
                start++;
            }
        }

        return count;
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] lower = new int[mid - start + 1];
        int[] upper = new int[end - mid];

        int index = 0;
        for (int i = start; i <= mid; i++) {
            lower[index] = nums[i];
            index++;
        }

        index = 0;
        for (int i = mid + 1; i <= end; i++) {
            upper[index] = nums[i];
            index++;
        }

        int lowerIndex = 0;
        int upperIndex = 0;
        index = start;
        while (lowerIndex < lower.length && upperIndex < upper.length) {
            if (lower[lowerIndex] <= upper[upperIndex]) {
                nums[index] = lower[lowerIndex];
                index++;
                lowerIndex++;
            } else {
                nums[index] = upper[upperIndex];
                index++;
                upperIndex++;
            }
        }

        while (lowerIndex < lower.length) {
            nums[index] = lower[lowerIndex];
            index++;
            lowerIndex++;
        }

        while (upperIndex < upper.length) {
            nums[index] = upper[upperIndex];
            index++;
            upperIndex++;
        }
    }
}

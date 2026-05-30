package StriverDsaSheet.Module_1_Arrays;

// https://takeuforward.org/data-structure/count-inversions-in-an-array

public class Problem27_CountInversions {

    public static void main (String[] args) {
        int[] nums = {5,3,2,1,4};
        System.out.println(countInversions(nums));
    }

    public static int countInversions(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int[] nums, int start, int end) {
        int count = 0;
        if (start<end) {
            int mid = (start+end)/2;
            count += mergeSort(nums, start, mid);
            count += mergeSort(nums, mid+1, end);
            count += countInversion(nums, start, mid, end);
            merge(nums, start, mid, end);
        }
        return count;
    }

    public static int countInversion(int[] nums, int start, int mid, int end) {
        int count = 0;
        int index = mid+1;
        while (start<=mid) {
            if (index<=end && nums[start]>nums[index]){
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
        int[] lower = new int[mid-start+1];
        int[] upper = new int[end-mid];

        int index = 0;
        for (int i=start; i<=mid; i++) {
           lower[index] = nums[i];
           index++;
        }

        index = 0;
        for(int i=mid+1; i<=end; i++) {
            upper[index] = nums[i];
            index++;
        }

        int li = 0;
        int ui = 0;
        index = start;
        while (li<lower.length && ui<upper.length) {
            if (lower[li]<=upper[ui]) {
                nums[index] = lower[li];
                index++;
                li++;
            }
            else {
                nums[index] = upper[ui];
                index++;
                ui++;
            }
        }

        while (li<lower.length) {
            nums[index] = lower[li];
            index++;
            li++;
        }

        while (ui<upper.length) {
            nums[index] = upper[ui];
            index++;
            ui++;
        }
    }
}

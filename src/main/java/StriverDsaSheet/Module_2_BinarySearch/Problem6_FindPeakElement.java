package StriverDsaSheet.Module_2_BinarySearch;

// https://leetcode.com/problems/find-peak-element/description/

public class Problem6_FindPeakElement {

    public static void main (String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int lb = 0;
        int ub = nums.length-1;

        while (lb<ub) {
            int mid = (lb+ub)/2;
            if (mid!=nums.length-1 && nums[mid+1]>nums[mid]) {
                lb = mid+1;
            }
            else {
                ub = mid;
            }
        }

        return lb;
    }
}

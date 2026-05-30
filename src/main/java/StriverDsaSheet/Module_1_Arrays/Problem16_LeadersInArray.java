package StriverDsaSheet.Module_1_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://takeuforward.org/data-structure/leaders-in-an-array/

public class Problem16_LeadersInArray {

    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
        System.out.println(findLeaders(nums));
    }

    public static List<Integer> findLeaders(int[] nums) {

        List<Integer> result = new ArrayList<>();
        result.add(nums[nums.length-1]);

        int max = nums[nums.length-1];
        for (int i=nums.length-2; i>=0; i--) {
            if (nums[i]>max) {
                max = nums[i];
                result.add(max);
            }
        }

        Collections.reverse(result);
        return result;
    }
}

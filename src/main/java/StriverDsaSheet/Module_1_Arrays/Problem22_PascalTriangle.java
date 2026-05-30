package StriverDsaSheet.Module_1_Arrays;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/

public class Problem22_PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstRow = List.of(1);
        result.add(firstRow);

        for (int i=1; i<numRows; i++) {
            List<Integer> previousRow = result.get(i-1);

            List<Integer> row = new ArrayList<>();
            int left = -1;
            int right = 0;
            while (right<=previousRow.size()) {
                int first = left==-1?0:previousRow.get(left);
                int second = right==previousRow.size()?0:previousRow.get(right);
                row.add(first+second);
                left++;
                right++;
            }
            result.add(row);
        }

        return result;
    }
}

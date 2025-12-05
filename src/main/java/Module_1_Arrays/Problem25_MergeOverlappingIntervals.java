package Module_1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/

public class Problem25_MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(nums)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> result = new ArrayList<>();

        int start = 0;
        List<Integer> row = new ArrayList<>();
        row.add(intervals[start][0]);
        row.add(intervals[start][1]);
        for (int i=1; i<intervals.length; i++) {
            if (intervals[i][0]>row.get(1)){
                result.add(row);
                start = i;
                row = new ArrayList<>();
                row.add(intervals[i][0]);
                row.add(intervals[i][1]);
            }
            else {
                row.set(1, Math.max(row.get(1), intervals[i][1]));
            }
        }

        result.add(row);

        int[][] answer = new int[result.size()][2];

        for (int i=0; i<result.size(); i++) {
            answer[i][0] = result.get(i).get(0);
            answer[i][1] = result.get(i).get(1);
        }

        return answer;
    }
}

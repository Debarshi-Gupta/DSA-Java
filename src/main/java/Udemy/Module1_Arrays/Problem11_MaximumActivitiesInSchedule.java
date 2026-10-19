package Udemy.Module1_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Problem11_MaximumActivitiesInSchedule {

    public static int maximumActivitiesInSchedule (int[][] schedule) {

        Arrays.sort(schedule, Comparator.comparingInt((int[] a) -> a[1])
                .thenComparingInt(a -> a[0]));

        int maximumActivities = 0;
        int prevEndTime = 0;
        for (int i=0; i<schedule.length; i++) {
            if (schedule[i][0]>=prevEndTime) {
                maximumActivities++;
                prevEndTime = schedule[i][1];
            }
        }

        return maximumActivities;
    }

    public static void main (String[] args) {

        // 3
        System.out.println(maximumActivitiesInSchedule(
                new int[][]{{7,9}, {0,10}, {4,5}, {8,9}, {4,10}, {5,7}}
        ));

        // 4
        System.out.println(maximumActivitiesInSchedule(
                new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}
        ));

        // 1
        System.out.println(maximumActivitiesInSchedule(
                new int[][]{{1, 5}, {2, 6}, {3, 7}, {4, 8}}
        ));
    }
}

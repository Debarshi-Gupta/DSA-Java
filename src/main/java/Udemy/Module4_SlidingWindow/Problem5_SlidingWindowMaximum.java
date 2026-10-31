package Udemy.Module4_SlidingWindow;

import java.util.*;

public class Problem5_SlidingWindowMaximum {

    public static List<Integer> slidingWindowMaximum (int[] nums, int k) {

        List<Integer> result = new ArrayList<>();

        Deque<Integer> indexQueue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if (i < (k - 1)) {
                while (!indexQueue.isEmpty() && nums[indexQueue.getLast()] < nums[i]) {
                    indexQueue.removeLast();
                }
                indexQueue.addLast(i);
            } else {
                while (!indexQueue.isEmpty() && nums[indexQueue.getLast()] < nums[i]) {
                    indexQueue.removeLast();
                }
                indexQueue.addLast(i);

                while (!indexQueue.isEmpty() && indexQueue.getFirst() < (i - k + 1)) {
                    indexQueue.removeFirst();
                }

                result.add(indexQueue.getFirst());
            }
        }

        return result.stream().map(e -> nums[e]).toList();
    }

    public static void main (String[] args) {

        // [3, 3, 4, 5, 5, 5, 6]
        System.out.println(slidingWindowMaximum(
                new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 3
        ));

        // [4, 4, 4]
        System.out.println(slidingWindowMaximum(
                new int[]{4, 4, 4, 4}, 2
        ));

        // [3, 3, 5, 5, 6, 7]
        System.out.println(slidingWindowMaximum(
                new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3
        ));
    }
}

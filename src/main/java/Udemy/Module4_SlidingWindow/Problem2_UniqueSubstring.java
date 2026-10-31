package Udemy.Module4_SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Problem2_UniqueSubstring {

    public static String findUniqueSubstring (String s) {

        int left = 0;

        int size = 1;
        int maxSize = 1;

        int[] resultIndex = new int[2];
        Set<Character> visited = new HashSet<>();
        visited.add(s.charAt(0));

        for (int i=1; i<s.length(); i++) {
            char c = s.charAt(i);

            if (!visited.contains(c)) {
                size++;
                if (size>maxSize) {
                    resultIndex[0] = left;
                    resultIndex[1] = i;
                    maxSize = size;
                }
                visited.add(c);
            }
            else {
                while (visited.contains(c)) {
                    visited.remove(s.charAt(left));
                    left++;
                    size--;
                }
                visited.add(c);
                size++;
            }
        }

        return s.substring(resultIndex[0], resultIndex[1]+1);
    }

    public static void main (String[] args) {

        // ekbhaiy
        System.out.println(findUniqueSubstring("prateekbhaiya"));

        // abc
        System.out.println(findUniqueSubstring("abcabcbb"));

        // b
        System.out.println(findUniqueSubstring("bbbbbbbbb"));
    }
}

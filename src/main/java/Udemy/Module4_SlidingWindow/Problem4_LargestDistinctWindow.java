package Udemy.Module4_SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Problem4_LargestDistinctWindow {

    public static String largestDistinctWindow (String s) {

        int[] result = new int[2];
        int[] current = new int[2];

        Set<Character> visited = new HashSet<>();
        visited.add(s.charAt(0));

        for (int i=1; i<s.length(); i++) {
            if (!visited.contains(s.charAt(i))) {
                current[1] = i;
                if ((current[1]-current[0]+1) > (result[1]-result[0]+1)) {
                    result[0] = current[0];
                    result[1] = current[1];
                }
                visited.add(s.charAt(i));
            }
            else {
                current[1] = i;
                Character c = s.charAt(i);
                while (current[0]<current[1] && visited.contains(c)) {
                    visited.remove(s.charAt(current[0]));
                    current[0] = current[0] + 1;
                }
                visited.add(c);
            }
        }

        return s.substring(result[0], result[1]+1);
    }

    public static void main (String[] args) {

        // dbca
        System.out.println(largestDistinctWindow("aabcbcdbcaaad"));

        // a
        System.out.println(largestDistinctWindow("aaaa"));

        // abcdef
        System.out.println(largestDistinctWindow("abcdef"));
    }
}

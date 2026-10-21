package Udemy.Module2_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem4_SortSubsequence {

    public static List<String> sortSubsequence (String s) {
        List<String> subsequences = new ArrayList<>();
        subsequences.add("");

        findSubsequences(s, 0, "", subsequences);

        Collections.sort(subsequences, Comparator.comparingInt((String a) -> a.length())
                .thenComparing((a,b) -> a.compareTo(b)));

        return subsequences;
    }

    public static void findSubsequences (String s, int index,
                                         String current, List<String> result) {

        if (index==s.length()) {
            return;
        }
        result.add(current + s.charAt(index));
        findSubsequences(s, index+1, current+s.charAt(index), result);
        findSubsequences(s, index+1, current, result);
    }

    public static void main (String[] args) {

        // [, a, b, c, ab, ac, bc, abc]
        System.out.println(sortSubsequence("abc"));

        // [, a, a, b, aa, ab, ba, aba]
        System.out.println(sortSubsequence("aba"));

        // []
        System.out.println(sortSubsequence(""));
    }
}

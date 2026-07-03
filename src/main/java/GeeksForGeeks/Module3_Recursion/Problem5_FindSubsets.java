package GeeksForGeeks.Module3_Recursion;

import java.util.ArrayList;
import java.util.List;

public class Problem5_FindSubsets {

    public static void findSubsets (String s, List<String> result, String current) {

        if (s.isEmpty()) {
            result.add(current);
            return;
        }

        findSubsets(s.substring(1), result, current+s.charAt(0));
        findSubsets(s.substring(1), result, current);
    }

    public static void main (String[] args) {

        List<String> result = new ArrayList<>();
        findSubsets("abc", result, "");
        // Expected Output: [abc, ab, ac, a, bc, b, c, ]
        System.out.println(result);
    }
}

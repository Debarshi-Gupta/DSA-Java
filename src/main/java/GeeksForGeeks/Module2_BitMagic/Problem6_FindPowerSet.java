package GeeksForGeeks.Module2_BitMagic;

import java.util.ArrayList;
import java.util.List;

public class Problem6_FindPowerSet {

    public static List<String> findPowerSet (String s) {

        List<String> result = new ArrayList<>();

        int powerSetSize = 1 << s.length();

        for (int i=0; i<powerSetSize; i++) {

            String solution = "";
            int value = i;
            int index = 0;
            while (value!=0) {
                int lastBit = value%2;
                if (lastBit==1){
                    solution =  solution + s.charAt(index);
                }
                index++;
                value = value/2;
            }
            result.add(solution);
        }

        return result;
    }

    public static void main (String[] args) {

        // Expected Output: [, a, b, ab, c, ac, bc, abc]
        System.out.println(findPowerSet("abc"));

        // Expected Output: [, a, b, ab]
        System.out.println(findPowerSet("ab"));
    }
}

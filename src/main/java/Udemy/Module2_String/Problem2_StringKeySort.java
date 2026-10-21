package Udemy.Module2_String;

import java.util.*;

public class Problem2_StringKeySort {

    public static List<List<String>> stringKeySort (String[] str, int column,
                             boolean reverse, SortingMethod sortingMethod) {

        List<List<String>> strList = new ArrayList<>();
        for (int i=0; i<str.length; i++) {
            String[] splitStr = str[i].split(" ");
            List<String> splitList = Arrays.stream(splitStr).toList();
            strList.add(splitList);
        }

        Collections.sort(strList, (a,b) -> {
            int index = column-1;
            if (sortingMethod==SortingMethod.NUMERIC) {
                if (!reverse) {
                    return Integer.compare(Integer.parseInt(a.get(index)),
                            Integer.parseInt(b.get(index)));
                }
                else {
                    return Integer.compare(Integer.parseInt(b.get(index)),
                            Integer.parseInt(a.get(index)));
                }
            }
            else {
                if (!reverse) {
                    return a.get(index).compareTo(b.get(index));
                }
                else {
                    return b.get(index).compareTo(a.get(index));
                }
            }
        });

        return strList;
    }

    public static void main (String[] args) {

        // [[10,, 12], [129, 13], [87, 022]]
        System.out.println(stringKeySort(
                new String[]{"87 022", "10, 12", "129 13"},
                2,
                false,
                SortingMethod.NUMERIC
        ));

        // [[87, 022], [10,, 12], [129, 13]]
        System.out.println(stringKeySort(
                new String[]{"87 022", "10, 12", "129 13"},
                2,
                true,
                SortingMethod.LEXICOGRAPHIC
        ));
    }
}

enum SortingMethod {
    NUMERIC,
    LEXICOGRAPHIC
}

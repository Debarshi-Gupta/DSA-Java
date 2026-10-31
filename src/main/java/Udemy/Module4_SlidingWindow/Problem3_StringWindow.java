package Udemy.Module4_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Problem3_StringWindow {

    public static String stringWindow (String s, String target) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        Map<Character, Integer> remainingMap = new HashMap<>();

        boolean validWindowExists = false;

        for (int i=0; i<target.length(); i++) {
            Character c = target.charAt(i);
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c)+1);
                remainingMap.put(c, remainingMap.get(c)+1);
            }
            else {
                frequencyMap.put(c, 1);
                remainingMap.put(c, 1);
            }
        }

        Map<Character, Integer> visitedMap = new HashMap<>();
        int left = 0;
        int[] result = new int[2];
        result[0] = 0;
        result[1] = s.length()-1;

        for (int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);

            if (!frequencyMap.containsKey(c)) {
                if (visitedMap.containsKey(c)) {
                    visitedMap.put(c, visitedMap.get(c)+1);
                }
                else {
                    visitedMap.put(c, 1);
                }
            }
            else {
                if (visitedMap.containsKey(c)) {
                    visitedMap.put(c, visitedMap.get(c)+1);
                }
                else {
                    visitedMap.put(c, 1);
                }
                if (remainingMap.containsKey(c)) {
                    if (remainingMap.get(c)==1) {
                        remainingMap.remove(c);
                    }
                    else {
                        remainingMap.put(c, remainingMap.get(c)-1);
                    }
                }

                if (remainingMap.isEmpty()) {
                    validWindowExists = true;
                    while (left<=i) {
                        Character leftCharacter = s.charAt(left);
                        visitedMap.put(leftCharacter, visitedMap.get(leftCharacter)-1);
                        if (frequencyMap.containsKey(leftCharacter) &&
                                frequencyMap.get(leftCharacter)>visitedMap.get(leftCharacter)) {
                            remainingMap.put(leftCharacter, 1);
                            break;
                        }
                        left++;
                    }
                    if ((i-left+1)<(result[1]-result[0]+1)) {
                        result[0] = left;
                        result[1] = i;
                    }
                    left++;
                }
            }


        }

        return validWindowExists? s.substring(result[0], result[1]+1) : "";
    }

    public static void main (String[] args) {

        System.out.println(stringWindow("hello", "leo"));

        System.out.println(stringWindow("ghetughyehtvtiehg", "hvh"));

        System.out.println(stringWindow("olleh", "leo"));
    }
}

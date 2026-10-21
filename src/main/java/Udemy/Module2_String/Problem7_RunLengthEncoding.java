package Udemy.Module2_String;

public class Problem7_RunLengthEncoding {

    public static String runLengthEncoding (String s) {

        Character currentCharacter = s.charAt(0);
        int currentCount = 1;

        StringBuilder result = new StringBuilder("");

        for (int i=1; i<s.length(); i++) {
            Character newCharacter = s.charAt(i);

            if (newCharacter==currentCharacter) {
                currentCount++;
            }
            else {
                result.append(currentCharacter.toString()).append(currentCount);
                currentCharacter = newCharacter;
                currentCount = 1;
            }
        }

        result.append(currentCharacter).append(currentCount);

        return result.length()<s.length()?result.toString():s;
    }

    public static void main (String[] args) {

        // b3a4d1e1x6
        System.out.println(runLengthEncoding("bbbaaaadexxxxxx"));

        // abc
        System.out.println(runLengthEncoding("abc"));

        // aabb
        System.out.println(runLengthEncoding("aabb"));
    }
}

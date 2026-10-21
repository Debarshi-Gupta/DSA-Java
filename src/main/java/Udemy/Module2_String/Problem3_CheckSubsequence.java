package Udemy.Module2_String;

public class Problem3_CheckSubsequence {

    public static boolean checkSubsequence (String s, String key) {

        int i = 0;
        int j = 0;

        while (i<s.length()) {
            if (s.charAt(i)==key.charAt(j)) {
                j++;
            }
            if (j==key.length()) {
                return true;
            }
            i++;
        }

        return false;
    }

    public static void main (String[] args) {

        // True
        System.out.println(checkSubsequence(
                "Hello World",
                "eld"
        ));

        // False
        System.out.println(checkSubsequence(
                "abc",
                "acb"
        ));

        // True
        System.out.println(checkSubsequence(
                "aabbcc",
                "abb"
        ));
    }
}

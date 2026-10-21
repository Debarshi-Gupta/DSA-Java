package Udemy.Module2_String;

public class Problem1_ReplaceBlankSpace {

    public static String replaceBlankSpace (String s, String token) {

        return s.replaceAll(" ", token);
    }

    public static void main (String[] args) {

        // He%20is%20the%20best%20coder.
        System.out.println(replaceBlankSpace("He is the best coder.", "%20"));

        // hello-world
        System.out.println(replaceBlankSpace("hello world", "-"));

        // a__b
        System.out.println(replaceBlankSpace("a  b", "_"));
    }
}

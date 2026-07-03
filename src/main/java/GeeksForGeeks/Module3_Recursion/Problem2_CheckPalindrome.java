package GeeksForGeeks.Module3_Recursion;

public class Problem2_CheckPalindrome {

    public static boolean checkPalindrome (String s) {

        if (s.length()<=1) {
            return true;
        }

        if (s.charAt(0)!=s.charAt(s.length()-1)) {
            return false;
        }

        return checkPalindrome(s.substring(1, s.length()-1));
    }

    public static void main (String[] args) {

        // Expected Output: True
        System.out.println(checkPalindrome("aba"));

        // Expected Output: True
        System.out.println(checkPalindrome("abba"));

        // Expected Output: False
        System.out.println(checkPalindrome("abc"));
    }
}

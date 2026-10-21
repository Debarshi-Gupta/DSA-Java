package Udemy.Module2_String;

public class Problem8_PalindromeBreak {

    public static String palindromeBreak (String s) {

        int left = 0;
        int right = s.length()-1;

        String smallest = "";

        while (left<right) {
            Character leftCharacter = s.charAt(left);
            Character rightCharacter = s.charAt(right);

            if (leftCharacter=='a') {
                String palindromeBreak = s.substring(0, left)
                        + 'b' + s.substring(left+1);

                if (smallest.isBlank()) {
                    smallest = palindromeBreak;
                }
                else {
                    smallest = smallest.compareTo(palindromeBreak)<0?smallest:palindromeBreak;
                }
            }
            else {
                String palindromeBreak = s.substring(0, left)
                        + 'a' + s.substring(left+1);

                if (smallest.isBlank()) {
                    smallest = palindromeBreak;
                }
                else {
                    smallest = smallest.compareTo(palindromeBreak)<0?smallest:palindromeBreak;
                }
            }


            if (rightCharacter=='a') {
                String palindromeBreak = s.substring(0, right)
                        + 'b' + s.substring(right+1);

                if (smallest.isBlank()) {
                    smallest = palindromeBreak;
                }
                else {
                    smallest = smallest.compareTo(palindromeBreak)<0?smallest:palindromeBreak;
                }
            }
            else {
                String palindromeBreak = s.substring(0, right)
                        + 'a' + s.substring(right+1);

                if (smallest.isBlank()) {
                    smallest = palindromeBreak;
                }
                else {
                    smallest = smallest.compareTo(palindromeBreak)<0?smallest:palindromeBreak;
                }
            }

            left++;
            right--;
        }

        return smallest;
    }

    public static void main (String[] args) {

        // aaccba
        System.out.println(palindromeBreak("abccba"));

        // ab
        System.out.println(palindromeBreak("aa"));

        // abb
        System.out.println(palindromeBreak("aba"));
    }
}

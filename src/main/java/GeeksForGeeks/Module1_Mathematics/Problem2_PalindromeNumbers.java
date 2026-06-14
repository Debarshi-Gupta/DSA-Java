package GeeksForGeeks.Module1_Mathematics;

public class Problem2_PalindromeNumbers {

    public static boolean checkPalindrome (int num) {

        int originalNumber = num;
        int reverse = 0;

        while (num>0) {
            int lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num/=10;
        }

        return originalNumber==reverse;
    }

    public static void main (String[] args) {

        // Expected Output: True
        System.out.println(checkPalindrome(78987));

        // Expected Output: True
        System.out.println(checkPalindrome(5665));

        // Expected Output: False
        System.out.println(checkPalindrome(123));
    }
}

package GeeksForGeeks.Module1_Mathematics;

public class Problem1_CountDigits {

    public static int countDigits(int num) {

        int digits = 0;

        while (num>0) {
            digits++;
            num/=10;
        }

        return digits;
    }

    public static void main (String[] args) {

        // Expected Output: 4
        System.out.println(countDigits(9235));

        // Expected Output: 1
        System.out.println(countDigits(7));

        // Expected Output: 6
        System.out.println(countDigits(100000));
    }
}

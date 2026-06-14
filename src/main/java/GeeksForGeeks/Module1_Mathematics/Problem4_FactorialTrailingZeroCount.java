package GeeksForGeeks.Module1_Mathematics;

public class Problem4_FactorialTrailingZeroCount {

    public static int countTrailingZerosInFactorial (int num) {

        int count = 0;

        for (int i=5; i<=num; i*=5) {
            count += num/i;
        }

        return count;
    }

    public static void main (String[] args) {

        // Expected Output: 0
        System.out.println(countTrailingZerosInFactorial(3));

        // Expected Output: 2
        System.out.println(countTrailingZerosInFactorial(10));

        // Expected Output: 6
        System.out.println(countTrailingZerosInFactorial(25));
    }
}

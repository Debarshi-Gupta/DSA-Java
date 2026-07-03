package GeeksForGeeks.Module3_Recursion;

public class Problem3_SumOfDigits {

    public static int sumOfDigits (int num) {

        if (num==0) {
            return 0;
        }

        return num%10 + sumOfDigits(num/10);
    }

    public static void main (String[] args) {

        // Expected Output: 7
        System.out.println(sumOfDigits(313));

        // Expected Output: 5
        System.out.println(sumOfDigits(5));

        // Expected Output: 1
        System.out.println(sumOfDigits(100));
    }
}

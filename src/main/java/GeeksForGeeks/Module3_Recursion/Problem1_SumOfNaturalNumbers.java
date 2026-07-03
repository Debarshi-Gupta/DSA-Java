package GeeksForGeeks.Module3_Recursion;

public class Problem1_SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers (int n) {

        if (n==0 || n==1) {
            return n;
        }
        return n + sumOfNaturalNumbers(n-1);
    }

    public static void main (String[] args) {

        // Expected Output: 6
        System.out.println(sumOfNaturalNumbers(3));

        // Expected Output: 0
        System.out.println(sumOfNaturalNumbers(0));

        // Expected Output: 55
        System.out.println(sumOfNaturalNumbers(10));
    }
}

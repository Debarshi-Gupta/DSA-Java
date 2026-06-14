package GeeksForGeeks.Module1_Mathematics;

public class Problem3_Factorial {

    public static int factorial (int num) {
        int factorial = 1;

        for (int i=2; i<=num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main (String[] args) {

        // Expected Output: 6
        System.out.println(factorial(3));

        // Expected Output: 720
        System.out.println(factorial(6));

        // Expected Output: 3628800
        System.out.println(factorial(10));
    }
}

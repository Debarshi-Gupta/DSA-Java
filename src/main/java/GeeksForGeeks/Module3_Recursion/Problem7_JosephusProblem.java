package GeeksForGeeks.Module3_Recursion;

public class Problem7_JosephusProblem {

    public static int josephusProblem (int n, int k) {

        if (n==1) {
            return 0;
        }

        return (josephusProblem(n-1, k) + k) % n;
    }

    public static void main (String[] args) {

        // Expected Output: 3
        System.out.println(josephusProblem(7, 3));

        // Expected Output: 2
        System.out.println(josephusProblem(5, 2));

        // Expected Output: 5
        System.out.println(josephusProblem(6, 1));
    }
}

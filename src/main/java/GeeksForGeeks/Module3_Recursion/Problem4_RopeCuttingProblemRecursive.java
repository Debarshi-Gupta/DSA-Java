package GeeksForGeeks.Module3_Recursion;

public class Problem4_RopeCuttingProblemRecursive {

    public static int ropeCuttingProblem (int length, int a, int b, int c) {

        if (length==0) {
            return 0;
        }

        if (length<0) {
            return -1;
        }

        int result = Math.max(Math.max(ropeCuttingProblem(length-a, a, b, c),
                ropeCuttingProblem(length-b, a, b, c)),
                ropeCuttingProblem(length-c, a, b, c));

        if (result==-1) {
            return -1;
        }
        else {
            return result+1;
        }
    }

    public static void main (String[] args) {

        // Expected Output: 2
        System.out.println(ropeCuttingProblem(23, 11, 9, 12));

        // Expected Output: 2
        System.out.println(ropeCuttingProblem(7, 5, 2, 2));

        // Expected Output: -1
        System.out.println(ropeCuttingProblem(5, 4, 2, 6));
    }
}

package GeeksForGeeks.Module1_Mathematics;

public class Problem5_GCD {

    public static int findGCD (int num1, int num2) {

        int larger = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);

        while (smaller!=0) {
            int remainder = larger%smaller;
            larger = smaller;
            smaller = remainder;
        }

        return larger;
    }

    public static void main (String[] args) {

        // Expected Output: 2
        System.out.println(findGCD(4, 6));

        // Expected Output: 100
        System.out.println(findGCD(100, 200));

        // Expected Output: 1
        System.out.println(findGCD(7, 13));
    }
}

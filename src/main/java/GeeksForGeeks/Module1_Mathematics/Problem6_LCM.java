package GeeksForGeeks.Module1_Mathematics;

public class Problem6_LCM {

    public static int findLCM (int num1, int num2) {

        return (num1*num2)/findGCD(num1, num2);
    }

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

        // Expected Output: 12
        System.out.println(findLCM(4, 6));

        // Expected Output: 30
        System.out.println(findLCM(10, 15));

        // Expected Output: 200
        System.out.println(findLCM(100, 200));
    }
}

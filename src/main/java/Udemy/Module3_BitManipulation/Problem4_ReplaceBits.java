package Udemy.Module3_BitManipulation;

public class Problem4_ReplaceBits {

    public static int replaceBitsInRage (int num1, int num2, int i, int j) {
        int num1Cleared = clearBitsInRange(num1, i, j);
        int mask = num2 << i;

        return num1Cleared | mask;
    }

    public static int clearBitsInRange (int num, int i, int j) {
        int mask1 = -1 << (j+1);
        int mask2 = (1<<i) - 1;
        int mask = mask1 | mask2;
        return num & mask;
    }

    public static void main (String[] args) {

        // 5
        System.out.println(replaceBitsInRage(15, 2, 1, 3));

        // 9
        System.out.println(replaceBitsInRage(31, 1, 1, 3));

        // 47
        System.out.println(replaceBitsInRage(40, 15, 0, 4));
    }
}

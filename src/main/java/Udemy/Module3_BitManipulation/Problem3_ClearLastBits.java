package Udemy.Module3_BitManipulation;

public class Problem3_ClearLastBits {

    public static int clearLastKBits (int num, int k) {

        int mask = (-1 << k);

        return num & mask;
    }

    public static void main (String[] args) {

        // 8
        System.out.println(clearLastKBits(15, 3));

        // 4
        System.out.println(clearLastKBits(7, 2));

        // 10
        System.out.println(clearLastKBits(10, 1));
    }
}
